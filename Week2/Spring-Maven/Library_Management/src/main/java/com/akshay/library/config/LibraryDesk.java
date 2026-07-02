package com.akshay.library.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Exercise 2: Annotation-based bean discovered via component scanning
 * and wired with @Value (annotation-driven IoC/DI, as opposed to the
 * XML approach used for Librarian in Exercise 1).
 */
@Component
public class LibraryDesk {

    @Value("Front Desk - Ground Floor")
    private String location;

    public void announce() {
        System.out.println("Book returns/checkouts are handled at: " + location);
    }
}
