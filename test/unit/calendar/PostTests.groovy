package calendar

import grails.test.mixin.*
import org.junit.*
import calendar.*
/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostTests {

	def calendarService;

    void testDateteween() {

       def c = new GregorianCalendar(2009, Calendar.JULY,5);

       def post = new Post(postDate:c.time,title:'unpost',createdDate:new Date(),content:"test")
       println post.save(failOnError: true);

       def calendar = new MyCalendar(year:2009,month:Calendar.JULY);
       
       assert Post.count() == 1			
        def posts = Post.findAllByPostDateBetween(calendar.firstDateMonth, calendar.lastDateMonth)

        assert posts.size() == 1
    }

    void testSaveWithContent()
    {
    	def c = new GregorianCalendar(2009, Calendar.JULY,5);
		def post = new Post(postDate:c.time,title:'unpost',createdDate:new Date(), content: "This is a long content")

		println post.save(failOnError: true);

		assert Post.count() == 1

		def posts = Post.withCriteria{
			
			like('content','This is a long content')
		
		}

		assert posts.size() == 1 
    }


    void testUserPosts() {
        def u =  new User(login:'test',name:'test',password:'password').save()
        
        def c = new GregorianCalendar(2009, Calendar.JULY,5);
        
        u.addToPosts( new Post(postDate:c.time,title:'unpost',createdDate:new Date(),content:"test") )

        def month = new MyCalendar(year:2009,month:Calendar.JULY)
		
		def posts = calendarService.posts u,month

		assert posts.size() == 1
    }

}

