package calendar

class Post {

    static constraints = {
    }


	Date createdDate
    Date postDate
    String title

    static mapping = {
        content type: "text"
    }
}

