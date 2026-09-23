public class Leak {
    
    private String title;
    private String imageURL;
    private String author;
    private String date;
    private String version;

    public Leak(String title, String imageURL, String author, String date, String version){
        this.title = title;
        this.imageURL = imageURL;
        this.author = author;
        this.date = date;
        this.version = version;
    }

    public String getTitle(){
        return title;
    }

    public String getURL(){
        return imageURL;
    }

    public String getAuthor(){
        return author;
    }

    public String getDate(){
        return date;
    }

    public String getVersion(){
        return version;
    }

    @Override
    public String toString(){
        return "[" + version + "] " + title + " @" + author;
    }
}
