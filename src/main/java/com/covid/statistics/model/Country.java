package com.covid.statistics.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInDatabase;

    @JsonProperty("ID")
    @Column(name = "country_id")
    private String countryId;

    @JsonProperty("Country")
    @Column(name = "country_name")
    private String countryName;

    @JsonProperty("CountryCode")
    @Column(name = "country_code", unique = true)
    private String countryCode;

    @JsonProperty("Slug")
    @Column(name = "slug")
    private String slug;

    @JsonProperty("NewConfirmed")
    @Column(name = "new_confirmed")
    private Integer newConfirmed;

    @JsonProperty("TotalConfirmed")
    @Column(name = "total_confirmed")
    private Integer totalConfirmed;

    @JsonProperty("NewDeaths")
    @Column(name = "new_deaths")
    private Integer newDeaths;
    @JsonProperty("TotalDeaths")
    @Column(name = "total_deaths")
    private Integer totalDeaths;
    @JsonProperty("NewRecovered")
    @Column(name = "new_recovered")
    private Integer newRecovered;
    @JsonProperty("TotalRecovered")
    @Column(name = "total_recovered")
    private Integer totalRecovered;

    @JsonProperty("Date")
    @Column(name = "date")
    private String date;
}
