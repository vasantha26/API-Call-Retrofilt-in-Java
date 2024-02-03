package com.example.androidpharmaapp;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCall {

    public void getJokes(Context context, final Callback<ACodeModel> callback) {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:3000")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);



        Call<ACodeModel> call = service.getJokes();



        call.enqueue(new Callback<ACodeModel>() {
            @Override
            public void onResponse(Call<ACodeModel> call, Response<ACodeModel> response) {



                if (response.isSuccessful()) {

                    ACodeModel jokes = response.body();
                    callback.onResponse(call, Response.success(jokes));
                }
            }

            @Override
            public void onFailure(Call<ACodeModel> call, Throwable t) {
                Toast.makeText(context, "Request Fail", Toast.LENGTH_SHORT).show();
                callback.onFailure(call, t);
            }
        });
    }
}
