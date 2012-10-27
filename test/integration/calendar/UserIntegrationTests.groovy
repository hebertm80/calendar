package calendar

import static org.junit.Assert.*
import org.junit.*

class UserIntegrationTests {

    def calendarService

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {

    }

    @Test
    void testSaveUser() {
      def user =  new User(login:'test',name:'test',password:'password');

      user.save(failOnError:true);
    }

    void testUserPosts() {
        def u =  new User(login:'test',name:'test',password:'password').save()
        
        def c = new GregorianCalendar(2009, Calendar.JULY,5);
        def post = new Post(postDate:c.time,title:'unpost',createdDate:new Date(),content:"test")
        u.addToPosts(post)

        def month = new MyCalendar(year:2009,month:Calendar.JULY)
        
        def posts = calendarService.posts u,month

        println posts[5] 
        assert posts[5].size() == 1
        assert posts[5][0].id == post.id
        assert posts[5][0] == post
    }
}

