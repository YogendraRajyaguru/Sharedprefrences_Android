package com.example.jsonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin;

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Code for Verification

                SharedPreferences sharedPreferences = getSharedPreferences("Login",MODE_PRIVATE);
                SharedPreferences.Editor editor =  sharedPreferences.edit();

                editor.putBoolean("flag",true);
                editor.apply();

                Intent iHome = new Intent(Login.this,Home.class);
                startActivity(iHome);
            }
        });
    }
}