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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> info = new ArrayList<Info>();

        info.add(new Info(getString(R.string.attraction_name1), getString(R.string.attraction_addr1), R.drawable.bob_marley));
        info.add(new Info(getString(R.string.attraction_name2), getString(R.string.attraction_addr2), R.drawable.emancipation));
        info.add(new Info(getString(R.string.attraction_name3), getString(R.string.attraction_addr3), R.drawable.hope_gardens));
        info.add(new Info(getString(R.string.attraction_name4), getString(R.string.attraction_addr4), R.drawable.hope_zoo));
        info.add(new Info(getString(R.string.attraction_name5), getString(R.string.attraction_addr5), R.drawable.port_royal));
        info.add(new Info(getString(R.string.attraction_name6), getString(R.string.attraction_addr6), R.drawable.heroes_circle));
        InfoAdapter adapter = new InfoAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
