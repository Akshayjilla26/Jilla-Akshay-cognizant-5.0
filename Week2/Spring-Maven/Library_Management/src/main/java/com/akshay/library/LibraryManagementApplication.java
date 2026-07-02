package com.akshay.library;

import com.akshay.library.config.LibraryDesk;
import com.akshay.library.model.Book;
import com.akshay.library.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication implements CommandLineRunner {

    private final BookService bookService;
    private final LibraryDesk libraryDesk;
    private final ApplicationContext context;

    public LibraryManagementApplication(BookService bookService, LibraryDesk libraryDesk,
                                         ApplicationContext context) {
        this.bookService = bookService;
        this.libraryDesk = libraryDesk;
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
    }

    @Override
    public void run(String... args) {

        // ---- Exercise 1: XML-based bean (applicationContext.xml) ----
        try (ClassPathXmlApplicationContext xmlContext =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Librarian librarian = xmlContext.getBean("librarian", Librarian.class);
            librarian.greet();
        }

        // ---- Exercise 2: Annotation-based bean (@Component) ----
        libraryDesk.announce();

        // ---- Exercise 4: Java-config bean (@Configuration/@Bean) ----
        // Spring Boot's own ApplicationContext already picked up AppConfig's
        // @Bean definition via component scanning; fetched here to show a
        // second Librarian bean defined in Java, not XML.
        Librarian eveningLibrarian = context.getBean("eveningLibrarian", Librarian.class);
        eveningLibrarian.greet();

        // ---- Library Management functionality (Spring Data JPA) ----
        bookService.addBook(new Book("Effective Java", "Joshua Bloch", "978-0134685991", true));
        bookService.addBook(new Book("Clean Code", "Robert C. Martin", "978-0132350884", true));
        bookService.addBook(new Book("Spring in Action", "Craig Walls", "978-1617294945", true));

        System.out.println("\nAll books in library:");
        bookService.getAllBooks().forEach(System.out::println);

        System.out.println("\nChecking out 'Effective Java'...");
        bookService.checkoutBook(1L);

        System.out.println("\nAvailable books after checkout:");
        bookService.getAvailableBooks().forEach(System.out::println);
    }
}
