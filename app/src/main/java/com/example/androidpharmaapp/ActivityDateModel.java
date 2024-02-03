package com.example.androidpharmaapp;

import com.google.gson.annotations.SerializedName;

public class ActivityDateModel {

    @SerializedName("date")
    private String date;

    @SerializedName("timezone_type")
    private int timezoneType;

    @SerializedName("timezone")
    private String timezone;

}
