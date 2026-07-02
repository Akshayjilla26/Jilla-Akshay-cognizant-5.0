package com.akshay.library;

import com.akshay.library.beans.Librarian;
import com.akshay.library.model.Book;
import com.akshay.library.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

/**
 * Week 2 - Spring & Maven, Ex 1, 2 and 4.
 *
 * Ex 1: applicationContext.xml defines the "librarian" bean (classic XML config).
 * Ex 2: BookService uses annotation-based DI (@Service / @Autowired).
 * Ex 4: The whole app is bootstrapped as a Spring Boot application with
 *       Spring Data JPA doing the persistence for the Book entity.
 */
@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class LibraryManagementApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LibraryManagementApplication.class, args);

        // Ex 1: fetch the XML-defined bean and prove it is a singleton
        Librarian librarian1 = context.getBean(Librarian.class);
        Librarian librarian2 = context.getBean(Librarian.class);
        librarian1.greet();
        System.out.println("Same instance (singleton)? " + (librarian1 == librarian2));
    }

    @Bean
    public CommandLineRunner demo(BookService bookService) {
        return args -> {
            System.out.println("\n--- Library Management Demo (Ex 4: Spring Boot + Spring Data JPA) ---");

            bookService.addBook(new Book("Effective Java", "Joshua Bloch", "Programming", true));
            bookService.addBook(new Book("Clean Code", "Robert C. Martin", "Programming", true));
            bookService.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", true));

            List<Book> allBooks = bookService.getAllBooks();
            System.out.println("All books in library: " + allBooks.size());
            allBooks.forEach(System.out::println);

            bookService.issueBook(allBooks.get(0).getId());
            System.out.println("\nAvailable books after issuing one:");
            bookService.getAvailableBooks().forEach(System.out::println);
        };
    }
}
