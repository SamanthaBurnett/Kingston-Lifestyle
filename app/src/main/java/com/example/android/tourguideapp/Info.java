package com.example.android.tourguideapp;

public class Info {

    private String mLocationName;

    private String mLocationAddress;

    private int mImageResourceID = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    public Info(String mLocationName, String mLocationAddress, int mImageResourceID) {
        this.mLocationName = mLocationName;
        this.mLocationAddress = mLocationAddress;
        this.mImageResourceID = mImageResourceID;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public String getLocationAddress() {
        return mLocationAddress;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE;
    }
}
