package calendar
import calendar.MyCalendar

class CalendarService {

    def posts(User user, MyCalendar calendar) {

    	println user.class.properties
    	def posts = Post.withCriteria{
    			and{
    				eq('user', user)
    				between('postDate',calendar.firstDateMonth, calendar.lastDateMonth)
    			}
    	}

    	def postsByDay = [:]
	    posts.each{ post -> 

	    	def c = new GregorianCalendar()
	    	c.setTime(post.postDate)
	    	def day = c.get(Calendar.DAY_OF_MONTH)

	    	if ( !postsByDay[day] )
	    		 postsByDay[day] = [];
	    	
	    	postsByDay[day].add(post)
	    }

	    return postsByDay;
    }
}
