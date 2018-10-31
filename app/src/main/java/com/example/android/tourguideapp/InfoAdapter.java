package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Info> {

    public InfoAdapter(Activity context, ArrayList<Info> info) {
        super (context, 0, info);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the info object located at this position in the list
        Info currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID location_name
        TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);
        // Set text to location name
        locationName.setText(currentLocation.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID location_info
        TextView locationInfo = (TextView) listItemView.findViewById(R.id.location_info);
        // Set text to location's address
        locationInfo.setText(currentLocation.getLocationAddress());

        ImageView locationImageView = (ImageView) listItemView.findViewById(R.id.location_image);

        if (currentLocation.hasImage()) {
            locationImageView.setImageResource(currentLocation.getImageResourceID());
            locationImageView.setVisibility(View.VISIBLE);
        } else {
            locationImageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), R.color.view_background);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
