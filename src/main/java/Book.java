public class Book {
    private String title;
    private String author;
    private int isbn;

    Book() {

    }

    public Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setAge(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String toString() {
        return "title: " + title + ", author: " + author + ", isbn: " + isbn;
    }





















































    
}
