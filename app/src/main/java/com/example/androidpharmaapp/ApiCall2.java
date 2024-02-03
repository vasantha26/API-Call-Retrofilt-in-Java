package com.example.androidpharmaapp;

import android.content.Context;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCall2 {

    public void getDoctor(Context context, final Callback<DoctorModel> callback) {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:3000")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);


        Call<DoctorModel> call = service.getDoctor();



        call.enqueue(new Callback<DoctorModel>() {
            @Override
            public void onResponse(Call<DoctorModel> call, Response<DoctorModel> response) {

                if (response.isSuccessful()) {

                    DoctorModel jokes = response.body();
                    callback.onResponse(call, Response.success(jokes));
                }
            }

            @Override
            public void onFailure(Call<DoctorModel> call, Throwable t) {
                // This method is called when the API request fails.
                Toast.makeText(context, "Request Fail", Toast.LENGTH_SHORT).show();
                callback.onFailure(call, t);
            }
        });
    }
}
