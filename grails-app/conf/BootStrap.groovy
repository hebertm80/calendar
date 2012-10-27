import calendar.*
class BootStrap {

    def init = { servletContext ->
    environments {
	    development {
		def jdoe = new User(login:"jdoe", password:"password", name:"John Doe")
		def c = new GregorianCalendar(2009, Calendar.JULY,5);
        def post = new Post(postDate:c.time,title:'unpost',createdDate:new Date(),content:"test")
		jdoe.addToPosts(post)
		jdoe.save()	
	    } }
    def destroy = {
    }
}
}

