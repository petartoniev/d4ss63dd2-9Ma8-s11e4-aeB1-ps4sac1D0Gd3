package com.covid.statistics.controller;

import com.covid.statistics.model.Country;
import com.covid.statistics.service.CountryStatisticsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CountryStatisticsController {

    @Autowired
    private CountryStatisticsService statisticsService;

    @GetMapping
    public List<Country> listAllCountryStatistics() throws JsonProcessingException {
        return statisticsService.listAllCountryStatistics();
    }

    @GetMapping("/country/{countryCode}")
    public Country getCountryStatistics(@PathVariable("countryCode") String countryCode) {
        return statisticsService.getCountryStatistics(countryCode);
    }

    @PostMapping
    public String importCountryStatistics() throws JsonProcessingException {
        return statisticsService.saveCovidStatistics();
    }
}
