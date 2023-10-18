package com.example.jsonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class Sharedprefrence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedprefrence);

        Handler handler;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedprefr=getSharedPreferences("Login",MODE_PRIVATE);
                Boolean check =  sharedprefr.getBoolean("flag",false);

                Intent iNext;
                if (check){ //for True (User Logged in)
                     iNext = new Intent(Sharedprefrence.this,Home.class);
                }
                else { //for False (either first Time or User is Logged out )
                     iNext = new Intent(Sharedprefrence.this,Login.class);
                }

                startActivity(iNext);

            }
        },3000);
    }
}