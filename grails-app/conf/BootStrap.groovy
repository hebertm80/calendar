import calendar.User
class BootStrap {

    def init = { servletContext ->
    environments {
	    development {
		def jdoe = new User(login:"jdoe", password:"password", name:"John Doe")
		jdoe.save()
	    } }
    def destroy = {
    }
}
}

