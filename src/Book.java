public class Book {
    private String bookTitle;
    private int numOfPages;
    private int pubYear;

    public Book(String bookTitle, int numOfPages, int year){
        this.bookTitle = bookTitle;
        this.numOfPages = numOfPages;
        this.pubYear = pubYear;
    }
    public String getbookTitle(){
        return bookTitle;
    }
    public String getnumofPages(){
        return numOfPages + " pages";
    }
    public int getpubYear(){
        return pubYear;
    }
    public String toString(){
        return getbookTitle() + ", "+ getnumofPages()+ ", " + getpubYear();
    }
}
