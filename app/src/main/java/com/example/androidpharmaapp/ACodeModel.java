package com.example.androidpharmaapp;

import com.google.gson.annotations.SerializedName;

public class ACodeModel {
    @SerializedName("ACode")
    private String aCode;

    @SerializedName("Adate")
    private String aDate;

    @SerializedName("rptdate")
    private String reportDate;

    @SerializedName("SF_Code")
    private String sfCode;

    @SerializedName("SF_Name")
    private String sfName;

    @SerializedName("Activity_Date")
    private ActivityDateModel activityDate;

    @SerializedName("wtype")
    private String workType;

    @SerializedName("FWFlg")
    private String fwFlag;

    @SerializedName("Drs")
    private String drs;

    @SerializedName("Chm")
    private String chm;

    @SerializedName("Stk")
    private String stk;

    @SerializedName("Udr")
    private String udr;

    @SerializedName("Hos")
    private String hos;

    @SerializedName("Cip")
    private String cip;

    @SerializedName("intime")
    private String inTime;

    @SerializedName("outtime")
    private String outTime;

    @SerializedName("inaddress")
    private String inAddress;

    @SerializedName("outaddress")
    private String outAddress;

    @SerializedName("Desig_Code")
    private String designationCode;

    @SerializedName("HalfDay_FW_Type")
    private String halfDayFWType;

    @SerializedName("remarks")
    private String remarks;

    @SerializedName("Rmdr")
    private String rmdr;

    @SerializedName("TerrWrk")
    private String terrWrk;


    public String getACode() {
        return aCode;
    }

    public void setACode(String aCode) {
        this.aCode = aCode;
    }

    public String getADate() {
        return aDate;
    }

    public void setADate(String aDate) {
        this.aDate = aDate;
    }
}
