package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> info = new ArrayList<Info>();

        info.add(new Info(getString(R.string.food_name1), getString(R.string.food_addr1), R.drawable.abar));
        info.add(new Info(getString(R.string.food_name2), getString(R.string.food_addr2), R.drawable.cuddyz_lounge));
        info.add(new Info(getString(R.string.food_name3), getString(R.string.food_addr3), R.drawable.devon_house));
        info.add(new Info(getString(R.string.food_name4), getString(R.string.food_addr4), R.drawable.macau_lounge));
        info.add(new Info(getString(R.string.food_name5), getString(R.string.food_addr5), R.drawable.tracks));
        info.add(new Info(getString(R.string.food_name6), getString(R.string.food_addr6), R.drawable.triple_century));
        InfoAdapter adapter = new InfoAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
