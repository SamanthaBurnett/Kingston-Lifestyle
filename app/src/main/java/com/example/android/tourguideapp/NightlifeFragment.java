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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> info = new ArrayList<Info>();

        info.add(new Info(getString(R.string.nightlife_name1), getString(R.string.nightlife_addr1), R.drawable.club_privi));
        info.add(new Info(getString(R.string.nightlife_name2), getString(R.string.nightlife_addr2), R.drawable.escape_247));
        info.add(new Info(getString(R.string.nightlife_name3), getString(R.string.nightlife_addr3), R.drawable.fiction_club));
        info.add(new Info(getString(R.string.nightlife_name4), getString(R.string.nightlife_addr4), R.drawable.palais_royale));
        info.add(new Info(getString(R.string.nightlife_name5), getString(R.string.nightlife_addr5), R.drawable.quad));
        info.add(new Info(getString(R.string.nightlife_name6), getString(R.string.nightlife_addr6), R.drawable.taboo_club));
        InfoAdapter adapter = new InfoAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
