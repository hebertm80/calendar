package calendar



import grails.test.mixin.*
import org.junit.*


/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(CalendarService)
class CalendarServiceTests {

	def calendarService;

    void testUserPosts() {
        def u =  new User(login:'test',name:'test',password:'password')
        
        def c = new GregorianCalendar(2009, Calendar.JULY,5);
        u.posts = []
        u.posts << new Post(postDate:c.time,title:'unpost',createdDate:new Date(),content:"test")

        def month = new MyCalendar(year:2009,month:Calendar.JULY)
		
		def posts = calendarService.posts u,month

		assert posts.size() == 1
    }
}
