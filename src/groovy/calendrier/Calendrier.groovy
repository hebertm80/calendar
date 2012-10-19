package calendrier

class MonCalendrier {
	int annee
    int mois

    def getJours()
    {
         Date d = new GregorianCalendar(annee, mois , 1) ;
         def  max = d.getActualMaximum(Calendar.DAY_OF_MONTH);

         return [1..max]
    }
}

