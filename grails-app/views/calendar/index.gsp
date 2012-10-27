
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>

        <script type="text/javascript">
        function nouveauPost(jour,mois,annee)
        {
            window.location = "/posts/add/" + jour + "/" + mois + "/" + annee;
        }

        function calendrier(jour,mois,annee)
        {
	        window.location = "/posts/date/" + jour + "/" + mois + "/" + annee;
        }

        $(document).ready(function() {
        $('#calendar li').mouseover(function() {
        $(this).css('background-color','#DDDDDD');
        }); // end click
        $('#calendar li').mouseout(function() {
        if( $(this).hasClass('filled') == false ){
	        $(this).css('background-color','#FFFFFF');
        }
        }); // end click
        }); // end ready
        </script>
        <r:require module="calendar"/>
     </head>
    <body>

<ol id="calendar">

    <g:each in="${calendar.days}" var="day">
        
        <g:if test="${day == 1}">
            <li class="premierJourMois" onclick="nouveauPost(${day},${calendar.month},${calendar.year})">    
        </g:if>

        <g:if test="${day != 1}">
            <li onclick="nouveauPost(${day},${calendar.month},${calendar.year})">
        </g:if>

        <g:each in="${postsByDay[day]}" var="post">
            ${post.title}
        </g:each>
   
         </li>
    </g:each>

</ol>
    </body>
</html>

