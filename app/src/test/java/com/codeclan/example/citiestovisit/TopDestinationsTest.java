package com.codeclan.example.citiestovisit;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 25/05/2017.
 */
public class TopDestinationsTest {

    @Test
    public void arrayListInitialEmpty() {
        TopDestinations topDestinations = new TopDestinations();
        assertEquals(15,topDestinations.getList().size());

    }

}