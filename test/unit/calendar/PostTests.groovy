package calendar



import grails.test.mixin.*
import org.junit.*
import calendrier.MonCalendrier
/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostTests {

    void testDateBeteween() {

       def c = new MonCalendrier(annee:2009, mois:Calendar.JULY)
       def post = new Post(postDate:c.time,title:'unpost',createdDate:c.time)
       println post.save(failOnError: true);
       def end = new GregorianCalendar(2009, Calendar.JULY, c.jours() )

        assert Post.count() == 1
        def posts = Post.findAllByPostDateBetween(first.time, end.time)

        assert posts.size == 1
    }
}

