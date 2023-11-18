package lab6;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {
    private static ArrayList<Book> books = new ArrayList<>();
    public Library() {

    }

    public static void addBook(Book newBook) {
        books.add(newBook);
    }

    public static void printBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }

    public static ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> b = new ArrayList<>();
        for(Book book : books) {
            if(StringUtils.included(book.title(), title)) {
                b.add(book);
            }
        }
        return b;
    }

    public static ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> b = new ArrayList<>();
        for(Book book : books) {
            if(StringUtils.included(book.publisher(), publisher)) {
                b.add(book);
            }
        }
        return b;
    }

    public static ArrayList<Book> searchByYear(int year) {
        return (ArrayList<Book>) books.
                stream().
                filter(b -> b.year() == year).
                collect(Collectors.toList());
    }
}
