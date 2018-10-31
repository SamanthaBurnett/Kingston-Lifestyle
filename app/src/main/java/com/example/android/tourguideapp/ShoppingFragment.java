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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> info = new ArrayList<Info>();

        info.add(new Info(getString(R.string.shop_name1), getString(R.string.shop_addr1), R.drawable.bargain_mall));
        info.add(new Info(getString(R.string.shop_name2), getString(R.string.shop_addr2), R.drawable.hwt_mall));
        info.add(new Info(getString(R.string.shop_name3), getString(R.string.shop_addr3), R.drawable.pavilion_mall));
        info.add(new Info(getString(R.string.shop_name4), getString(R.string.shop_addr4), R.drawable.south_parade));
        info.add(new Info(getString(R.string.shop_name5), getString(R.string.shop_addr5), R.drawable.sovereign));
        info.add(new Info(getString(R.string.shop_name6), getString(R.string.shop_addr6), R.drawable.tropical));
        info.add(new Info(getString(R.string.shop_name7), getString(R.string.shop_addr7), R.drawable.twin_gates));
        InfoAdapter adapter = new InfoAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
