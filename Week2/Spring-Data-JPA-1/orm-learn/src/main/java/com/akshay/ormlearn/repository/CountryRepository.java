package com.akshay.ormlearn.repository;

import com.akshay.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {

    List<Country> findByContinent(String continent);

    Country findByName(String name);

    List<Country> findByPopulationGreaterThan(long population);
}
