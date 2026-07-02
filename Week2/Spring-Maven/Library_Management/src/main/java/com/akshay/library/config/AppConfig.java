package com.akshay.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.akshay.library.Librarian;

/**
 * Exercise 4: Java-based configuration (@Configuration + @Bean), the
 * third style of Spring IoC alongside the XML (Ex1) and annotation
 * (Ex2) styles above.
 */
@Configuration
@ComponentScan(basePackages = "com.akshay.library")
public class AppConfig {

    @Bean
    public Librarian eveningLibrarian() {
        return new Librarian("Priya", "Evening");
    }
}
