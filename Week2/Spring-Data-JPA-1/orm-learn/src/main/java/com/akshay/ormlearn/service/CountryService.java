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

    public Country getCountryByName(String name) {
        return countryRepository.findByName(name);
    }

    public List<Country> getCountriesByContinent(String continent) {
        return countryRepository.findByContinent(continent);
    }

    public List<Country> getCountriesWithPopulationOver(long population) {
        return countryRepository.findByPopulationGreaterThan(population);
    }

    public Country updateCountry(Long id, Country updated) {
        Country existing = countryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Country not found with id " + id));
        existing.setName(updated.getName());
        existing.setCapital(updated.getCapital());
        existing.setPopulation(updated.getPopulation());
        existing.setContinent(updated.getContinent());
        return countryRepository.save(existing);
    }

    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}
