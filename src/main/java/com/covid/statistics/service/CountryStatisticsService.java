package com.covid.statistics.service;

import com.covid.statistics.model.Country;
import com.covid.statistics.dto.CovidStatisticsResponse;
import com.covid.statistics.repository.CountryRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CountryStatisticsService {

    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private RestTemplate restTemplate;

    public String saveCovidStatistics() throws JsonProcessingException {
        String response = restTemplate.getForObject(
                "https://api.covid19api.com/summary", String.class);
        CovidStatisticsResponse covidStatisticsResponse = new ObjectMapper().readValue(response, CovidStatisticsResponse.class);

        List<Country> countriesStatistics = covidStatisticsResponse.getCountries();
        try {
            countryRepository.saveAll(countriesStatistics);
        } catch (RuntimeException e) {
            return "Save unsuccessful.";
        }
        return "Successfully imported country statistics.";
    }

    public List<Country> listAllCountryStatistics() {
        return countryRepository.findAll();
    }

    public Country getCountryStatistics(String countryId) {
        return countryRepository.getByCountryCode(countryId);
    }
}
