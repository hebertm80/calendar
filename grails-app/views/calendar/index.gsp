
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
     </head>
    <body>

<ol id="calendar">


    <g:each in="${jours}" var="jour" status="j">

    </g:each>


    </body>
</html>

