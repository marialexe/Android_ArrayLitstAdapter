package com.codeclan.example.citiestovisit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/05/2017.
 */
public class CitiesToVisitTest {

//    CitiesToVisit city;
//
//    @Before
//    public void before(){
//        CitiesToVisit city = new CitiesToVisit("New York", "USA", 1);
//    }

    @Test
    public void canCreateCitiesToVisit(){
        CitiesToVisit city = new CitiesToVisit("New York", "USA", 1);
        assertEquals(true,city instanceof CitiesToVisit);
    }

    @Test
    public void canGetCity(){
        CitiesToVisit city = new CitiesToVisit("New York", "USA", 1);
        assertEquals("New York",city.getCity());
    }

    @Test
    public void canGetCountry(){
        CitiesToVisit city = new CitiesToVisit("New York", "USA", 1);
        assertEquals("USA",city.getCountry());
    }

    @Test
    public void canGetRanking(){
        CitiesToVisit city = new CitiesToVisit("New York", "USA", 1);
        assertEquals(1,city.getRanking());
    }
}