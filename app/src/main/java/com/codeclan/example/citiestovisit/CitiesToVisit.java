package com.codeclan.example.citiestovisit;

import android.provider.MediaStore;

import org.w3c.dom.Text;

/**
 * Created by user on 24/05/2017.
 */

public class CitiesToVisit {

    private String city;
    private String country;
    private Integer ranking;
    private MediaStore.Images image;
    private Text details;

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
