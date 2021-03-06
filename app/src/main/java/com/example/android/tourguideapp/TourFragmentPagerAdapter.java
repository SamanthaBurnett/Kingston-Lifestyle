package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TourFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1){
            return new FoodFragment();
        } else if (position == 2){
            return new NightlifeFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attractions_tab);
        } else if (position == 1) {
            return mContext.getString(R.string.food_tab);
        } else if (position == 2) {
            return mContext.getString(R.string.nightlife_tab);
        } else {
            return mContext.getString(R.string.shopping_tab);
        }
    }
}
