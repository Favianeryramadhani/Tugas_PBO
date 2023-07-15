package com.example.pbo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnrelativelayout, btnlogin, btnregister, btnsplashscreen, btnlistviewdata, btnnegaraadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnrelativelayout = (Button) findViewById(R.id.btnrelativelayout);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnregister = (Button) findViewById(R.id.btnregister);
        btnsplashscreen = (Button) findViewById(R.id.btnsplashscreen);
        btnlistviewdata = (Button) findViewById(R.id.btnlistviewdata);
        btnnegaraadapter = (Button) findViewById(R.id.btnnegaraadapter);

        btnrelativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActSatu = new Intent(getApplicationContext(), RelativeActivity.class);
                startActivity(BukaActSatu);
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActdua = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(BukaActdua);
            }
        });
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActTiga = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(BukaActTiga);
            }
        });
        btnsplashscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActEmpat = new Intent(getApplicationContext(), SplashscreenActivity.class);
                startActivity(BukaActEmpat);
            }
        });
        btnlistviewdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActLima = new Intent(getApplicationContext(), ListViewActivity.class);
                startActivity(BukaActLima);
            }
        });
    }
}