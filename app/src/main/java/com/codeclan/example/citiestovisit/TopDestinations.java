package com.codeclan.example.citiestovisit;

import java.util.ArrayList;

/**
 * Created by user on 25/05/2017.
 */

public class TopDestinations {

    ArrayList<CitiesToVisit> topCityBreaks;

    public TopDestinations() {

        topCityBreaks = new ArrayList<CitiesToVisit>();
        topCityBreaks.add(new CitiesToVisit("New York", "USA",1));
        topCityBreaks.add(new CitiesToVisit("San Francisco", "USA",2));
        topCityBreaks.add(new CitiesToVisit("Vancouver", "Canada",3));
        topCityBreaks.add(new CitiesToVisit("Montreal", "Canada",4));
        topCityBreaks.add(new CitiesToVisit("St Petersburg", "Russia",5));
        topCityBreaks.add(new CitiesToVisit("Moscow", "Russia",6));
        topCityBreaks.add(new CitiesToVisit("Granada", "Spain",7));
        topCityBreaks.add(new CitiesToVisit("Seville", "Spain",8));
        topCityBreaks.add(new CitiesToVisit("Florence", "Italy",9));
        topCityBreaks.add(new CitiesToVisit("Dubrovnik", "Croatia",10));
        topCityBreaks.add(new CitiesToVisit("Riga", "Latvia",11));
        topCityBreaks.add(new CitiesToVisit("Vienna", "Austria",12));
        topCityBreaks.add(new CitiesToVisit("Dubai", "UAE",13));
        topCityBreaks.add(new CitiesToVisit("Bergen", "Norway",14));
        topCityBreaks.add(new CitiesToVisit("Budapest", "Hungary",15));

    }

    public ArrayList<CitiesToVisit> getList(){
        return topCityBreaks;
    }

}
