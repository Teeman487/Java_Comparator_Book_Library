public class Book {
    private String Author;
    private String Title;
    private int year;
    private int quantity;

    public Book(String author, String title, int year, int quantity) {
        Author = author;
        Title = title;
        this.year = year;
        this.quantity = quantity;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public int getYear() {
        return year;
    }

    public int getQuantity() {
        return quantity;
    }
}
