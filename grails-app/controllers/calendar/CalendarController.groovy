package calendar

class CalendarController extends ApplicationController {

	def calendarService;

    def index(){

		def d = new MyCalendar(year:2009,month:Calendar.JULY)
    }

    def caledar()
    {
        def user = session.user;
        calendarService.posts user d
    }
}

