package calendar

class CalendarController extends ApplicationController {

    def index(){


    }

    def caledar()
    {
        def user = session.user;
        user.posts.findAll
    }
}

