package com.codeclan.example.citiestovisit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 25/05/2017.
 */

public class TopDestinationsAdapter extends ArrayAdapter<CitiesToVisit> {


    public TopDestinationsAdapter(Context context, ArrayList<CitiesToVisit> cities) {
        super(context, 0, cities);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cities_item,parent,false);
        }

        CitiesToVisit currentCity = getItem(position);

        TextView city = (TextView) listItemView.findViewById(R.id.city);
        city.setText(currentCity.getCity());

        TextView country = (TextView) listItemView.findViewById(R.id.country);
        country.setText(currentCity.getCountry());

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentCity.getRanking().toString());

        listItemView.setTag(currentCity);

        return listItemView;

    }
}
