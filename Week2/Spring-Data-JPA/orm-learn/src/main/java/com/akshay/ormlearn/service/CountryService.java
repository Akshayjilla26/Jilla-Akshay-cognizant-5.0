package com.akshay.ormlearn.service;

import com.akshay.ormlearn.model.Country;
import com.akshay.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Optional<Country> getCountryById(Long id) {
        return countryRepository.findById(id);
    }

    public Optional<Country> getCountryByName(String name) {
        return countryRepository.findByName(name);
    }

    public List<Country> getCountriesWithPopulationAbove(Long population) {
        return countryRepository.findByPopulationGreaterThan(population);
    }

    public Country updateCountry(Long id, Country updated) {
        Country country = countryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Country not found: " + id));
        country.setName(updated.getName());
        country.setCapital(updated.getCapital());
        country.setPopulation(updated.getPopulation());
        return countryRepository.save(country);
    }

    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}
