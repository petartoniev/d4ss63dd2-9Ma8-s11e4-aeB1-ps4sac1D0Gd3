package com.covid.statistics.repository;

import com.covid.statistics.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {
public Country getByCountryCode(String countryCode);
}
