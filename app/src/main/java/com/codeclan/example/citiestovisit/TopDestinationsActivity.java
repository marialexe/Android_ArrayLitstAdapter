package com.codeclan.example.citiestovisit;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopDestinationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_destinations_activity);

        TopDestinations topDestinations = new TopDestinations();
        ArrayList<CitiesToVisit> citiesList = topDestinations.getList();

        TopDestinationsAdapter destinationsAdapter = new TopDestinationsAdapter(this, citiesList);

        ListView listView = (ListView) findViewById(R.id.citiesList);
        listView.setAdapter(destinationsAdapter);
    }

    public void getCity(View listItem) {
        CitiesToVisit city = (CitiesToVisit) listItem.getTag();
        Log.d("City:", city.getCity());
    }
}
