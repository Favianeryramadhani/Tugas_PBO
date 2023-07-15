package com.example.pbo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView LvResult = findViewById(R.id.lvResult);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        String[][] dataNegara = new String[][]{
                {"Indonesia", "ASIA", "indonesia"},
                {"Malaysia", "ASIA", "malaysia"},
                {"Singapore", "ASIA", "singapore"},
                {"Italia", "EUROPE", "italia"},
                {"Inggris", "EUROPE", "inggris"},
                {"Belanda", "EUROPE", "belanda"},
                {"Argentina", "AMERICA", "argentina"},
                {"Chile", "AMERICA", "chile"},
                {"Mesir", "AFRICA", "mesir"},
                {"Uganda", "AFRICA", "uganda"}};

        NegaraadapterActivity adapter = new NegaraadapterActivity (ListViewActivity.this, dataNegara);
        LvResult.setAdapter((ListAdapter) adapter);

    }
}