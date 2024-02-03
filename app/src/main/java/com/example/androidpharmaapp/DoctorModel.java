package com.example.androidpharmaapp;

import com.google.gson.annotations.SerializedName;

public class DoctorModel {

    @SerializedName("name")
    private String name;

    @SerializedName("Territory")
    private String territory;

    @SerializedName("NextVstDate")
    private String nextVisitDate;

    @SerializedName("WWith")
    private String withWhom;

    @SerializedName("Call_Fdback")
    private String callFeedback;

    @SerializedName("call_feedback")
    private String callFeedbackAlt;

    @SerializedName("dcr_dt")
    private String dcrDate;

    @SerializedName("products")
    private String products;

    @SerializedName("gifts")
    private String gifts;

    @SerializedName("pob_value")
    private int pobValue;

    @SerializedName("remarks")
    private String remarks;

    @SerializedName("visitTime")
    private String visitTime;

    @SerializedName("ModTime")
    private String modTime;

    @SerializedName("Trans_Detail_Slno")
    private String transDetailSlno;

    @SerializedName("checkin")
    private String checkin;

    @SerializedName("checkout")
    private String checkout;

    @SerializedName("Dcr_addr")
    private String dcrAddress;

    // Getters and setters for each field

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

}
