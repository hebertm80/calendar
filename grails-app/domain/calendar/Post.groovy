package calendar

class Post {

    static constraints = {
    }


	Date createdDate
    Date postDate
    String title
    String content
    
    static mapping = {
        content type: "text"
    }
}

