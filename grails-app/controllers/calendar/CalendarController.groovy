package calendar

class CalendarController {

	def calendarService;

    def index(){

		def d = new MyCalendar(year:2009,month:Calendar.JULY)
		def user = session.user;
        def posts = calendarService.posts user, d

        [postsByDay:posts,calendar:d]
    }

    def caledar()
    {
    	def d = new MyCalendar(year:2009,month:Calendar.JULY)

    }

}

