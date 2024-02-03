package com.example.androidpharmaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.rectangle_1);

        linearLayout.setOnClickListener(view -> {

            new ApiCall().getJokes(this, new Callback<ACodeModel>() {
                @Override
                public void onResponse( Call<ACodeModel> call,  Response<ACodeModel> response) {
                    Log.d("TAG", " dfghj >>> " + response.body().getACode());

                }

                @Override
                public void onFailure(Call<ACodeModel> call, Throwable t) {

                }
            });


            Intent intent = new Intent(this,ReportDetailsActivity.class);
            startActivity(intent);

        });
    }
}