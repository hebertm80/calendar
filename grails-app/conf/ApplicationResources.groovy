modules = {
    application {
        resource url:'js/application.js'
    }

    calendar {
    	dependsOn 'jquery'
        resource url:'css/calendar.css'
        resource url:'cs/sortable.coffee'
    }
}