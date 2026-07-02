package com.akshay.ormlearn;

import com.akshay.ormlearn.model.Country;
import com.akshay.ormlearn.service.CountryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private final CountryService countryService;

    public OrmLearnApplication(CountryService countryService) {
        this.countryService = countryService;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {
        countryService.addCountry(new Country("India", "New Delhi", 1_428_000_000L));
        countryService.addCountry(new Country("Japan", "Tokyo", 124_000_000L));
        countryService.addCountry(new Country("Canada", "Ottawa", 39_000_000L));

        System.out.println("\nAll countries:");
        countryService.getAllCountries().forEach(System.out::println);

        System.out.println("\nCountries with population above 100 million:");
        countryService.getCountriesWithPopulationAbove(100_000_000L).forEach(System.out::println);

        System.out.println("\nLookup by name 'Japan':");
        countryService.getCountryByName("Japan").ifPresent(System.out::println);
    }
}
