package com.codeclan.example.citiestovisit;

/**
 * Created by user on 24/05/2017.
 */

public class CitiesToVisit {

    private String city;
    private String country;
    private Integer ranking;

    public CitiesToVisit(String city, String country, int ranking){
        this.city = city;
        this.country = country;
        this.ranking = ranking;
    }

    public String getCity(){
        return this.city;
    }

    public String getCountry(){
        return this.country;
    }

    public Integer getRanking(){
        return this.ranking;
    }
}
