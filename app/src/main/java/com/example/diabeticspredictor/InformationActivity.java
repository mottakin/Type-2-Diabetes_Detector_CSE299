package com.example.diabeticspredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        button = (Button) findViewById(R.id.Button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationActivity.this, FoodActivity.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(InformationActivity.this, MedicinesActivity.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.Button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(InformationActivity.this, FAQActivity.class);
                startActivity(intent);
            }
        });

    }
}