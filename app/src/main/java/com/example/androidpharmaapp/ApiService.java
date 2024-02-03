package com.example.androidpharmaapp;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("http://sanffa.info/server/db_native_app.php?divisionCode=25&rptSF=MGR2240&rSF=MGR2240&axn=get/DayReports&sfCode=MGR2240&rptDt=2023-11-30")
    Call<ACodeModel> getJokes();


    @GET("http://sanffa.info/server/db_native_app.php?divisionCode=25&ACd=SA111-1721&rSF=MGR2240&axn=get/vwVstDet&typ=1&sfCode=MGR2240")
    Call<DoctorModel> getDoctor();
}
