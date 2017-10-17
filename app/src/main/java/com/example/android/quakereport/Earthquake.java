package com.example.android.quakereport;

/**
 * Created by ACER on 17/07/17.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mDate;
    private String mlocationSup;
    private String mUrl;

    public Earthquake(double Magnitude,String Location,long Date,String url){
        mMagnitude=Magnitude;
        if (Location.contains(",")){
            String arr[]=Location.split(",");
            mLocation=arr[1].toString();
            mlocationSup=arr[0].toString();
        }else{
            mLocation=Location;
        }
        mDate=Date;
        mUrl=url;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public long getmDate() {
        return mDate;
    }

    public void setmDate(long mDate) {
        this.mDate = mDate;
    }

    public String getMlocationSup() {
        return mlocationSup;
    }

    public void setMlocationSup(String mlocationSup) {
        this.mlocationSup = mlocationSup;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
