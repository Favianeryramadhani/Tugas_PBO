package com.example.pbo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class RelativeActivity extends AppCompatActivity {
    Button btntombol;
    Spinner provinsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        provinsi = findViewById(R.id.provinsi);
        btntombol = findViewById(R.id.btntombol);
        btntombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RelativeActivity.this,
                        "Pilihan " + provinsi.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        }
}