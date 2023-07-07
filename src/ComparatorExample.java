import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        Book maths = new Book("Mr Warith","GeneralMaths",2023,20);
        Book english = new Book("Mr Kozeem","Active English",2022,10);
        Book physics = new Book("Mr Tunde","New Physics",2018,1);
        Book agric = new Book("Mr Alaba","Farm Tool",1989,5);
        Book chemistry = new Book("Mr Jide","Organic Chemistry",2023,20);

        List<Book> books = new ArrayList<>();
        books.add(maths);
        books.add(english);
        books.add(physics);
        books.add(agric);
        books.add(chemistry);

        Collections.sort(books, new Comparator<Book>() {

            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getQuantity(), book2.getQuantity());
            }
        });

        for (Book book : books) {
            System.out.println("There are " + book.getQuantity() + " pieces of " + book.getTitle());
        }
    }
}
