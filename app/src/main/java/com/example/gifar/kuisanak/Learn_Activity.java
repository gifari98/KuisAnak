package com.example.gifar.kuisanak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Learn_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Learn");

    }
}
