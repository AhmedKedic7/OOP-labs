package lab7.LibraryCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryCatalog {
    private List<Book> books;


    public LibraryCatalog(List<Book> books) {
        this.books = new ArrayList<>(books);
    }
    public Optional<Book> checkAvailabilityByTitle(String bookTitle) {
        return books.stream()
                .filter(book -> book.bookTitle().equalsIgnoreCase(bookTitle))
                .findFirst();
    }
    public Optional<Book> getFirstAvailableBookByAuthor(String author){
        return books.stream()
                .filter(book -> book.author().equalsIgnoreCase(author)&& book.available())
                .findFirst();
    }
    public boolean updateAvailability(String bookTitle,boolean available){
        Optional<Book> optionalBook = checkAvailabilityByTitle(bookTitle);
        optionalBook.ifPresent(book -> {
            int index = books.indexOf(book);
            books.set(index, new Book(book.bookTitle(), book.author(), book.publicationYear(), available));
        });
        return optionalBook.isPresent();

    }
    public List<Book> getAvailableBooks() {
        return books.stream()
                .filter(Book::available)
                .toList();
    }

    public static void main(String[] args) {

        List<Book> bookList = List.of(
                new Book("Znakovi pored puta", " Ivo Andrić ", 1966, true),
                new Book("Sjećanje šume", " Miljenko Jergović",  2003, false),
                new Book("Putovanje u vječnost", "Meša Selimović", 1970, true),
                new Book("Derviš i smrt", "Meša Selimović", 1966, true),
                new Book("Smrt u Sarajevu", "Abdulah Sidran", 1966, false)
        );

        LibraryCatalog libraryCatalog = new LibraryCatalog(bookList);


        String titleToCheck = "Smrt u Sarajevu";
        Optional<Book> checkedBook = libraryCatalog.checkAvailabilityByTitle(titleToCheck);
        checkedBook.ifPresentOrElse(
                book -> System.out.println("Book '" + titleToCheck + "' is available."),
                () -> System.out.println("Book '" + titleToCheck + "' not found or not available.")
        );

        String authorToSearch = "Ivo Andrić";
        Optional<Book> firstAvailableBookByAuthor = libraryCatalog.getFirstAvailableBookByAuthor(authorToSearch);
        firstAvailableBookByAuthor.ifPresentOrElse(
                book -> System.out.println("First available book by " + authorToSearch + ": " + book),
                () -> System.out.println("No available books found by " + authorToSearch)
        );


        String titleToUpdate = "Putovanje u vječnost";
        boolean newAvailabilityStatus = true;
        boolean updated = libraryCatalog.updateAvailability(titleToUpdate, newAvailabilityStatus);
        if (updated) {
            System.out.println("Availability status of '" + titleToUpdate + "' updated to " + newAvailabilityStatus);
        } else {
            System.out.println("Book '" + titleToUpdate + "' not found.");
        }

        // Print available books
        System.out.println("Available books:");
        libraryCatalog.getAvailableBooks().forEach(System.out::println);
    }

}
