package calendar



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    @Test
    void testSaveUser() {
      def user =  new User(login:'test',name:'test',password:'password');

      user.save(failOnError:true);
    }

}
