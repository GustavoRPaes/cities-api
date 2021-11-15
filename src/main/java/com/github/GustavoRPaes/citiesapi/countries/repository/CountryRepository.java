package com.github.GustavoRPaes.citiesapi.countries.repository;

import com.github.GustavoRPaes.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
