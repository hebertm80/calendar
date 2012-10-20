package calendar

class MyCalendar {
	int year
    int month

    def getLastDateMonth()
    {
         def d = new GregorianCalendar(year, month , 1) ;
         def max = d.getActualMaximum(Calendar.DAY_OF_MONTH);
         return new GregorianCalendar(year, month , max).time
    }
    def getDate()
    {
    	def d = new GregorianCalendar(year, month , 1);
    	d.time
    }

    def getFirstDateMonth()
    {
    	def d = new GregorianCalendar(year,month,1);
    	d.time
    }

    def getNextYear()
    {
    	year + 1
    }

    def getNextMonth()
    {
    	if (month == 13) {
    		month = 1
    	}
    	else
    	{
    		month = month + 1
    	}

    	month
    }
}

