package com.covid.statistics.dto;

import com.covid.statistics.model.Country;
import com.covid.statistics.model.Global;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CovidStatisticsResponse {
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Global")
    private Global global;
    @JsonProperty("Countries")
    private List<Country> countries;

    @JsonProperty("Date")
    private String date;
}
