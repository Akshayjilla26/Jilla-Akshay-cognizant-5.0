package com.akshay.ormlearn;

import com.akshay.ormlearn.model.Country;
import com.akshay.ormlearn.service.CountryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Week 2 - Spring Data JPA, Exercise 1.
 * Basic ORM mapping and CRUD operations on a Country entity.
 */
@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CountryService countryService) {
        return args -> {
            System.out.println("\n--- orm-learn Demo (Country CRUD) ---");

            countryService.addCountry(new Country("India", "New Delhi", 1_428_000_000L, "Asia"));
            countryService.addCountry(new Country("Japan", "Tokyo", 123_000_000L, "Asia"));
            countryService.addCountry(new Country("Germany", "Berlin", 84_000_000L, "Europe"));

            System.out.println("All countries:");
            countryService.getAllCountries().forEach(System.out::println);

            System.out.println("\nCountries in Asia:");
            countryService.getCountriesByContinent("Asia").forEach(System.out::println);

            Country india = countryService.getCountryByName("India");
            india.setPopulation(1_430_000_000L);
            countryService.updateCountry(india.getId(), india);

            System.out.println("\nAfter updating India's population:");
            System.out.println(countryService.getCountryById(india.getId()).orElse(null));
        };
    }
}
