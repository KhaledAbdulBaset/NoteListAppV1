package com.example.notekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// that allows you to load up the layout you've designed in your activity

        List<String> DataOfSpinner = new ArrayList<>();
        DataOfSpinner.add("DataStructure");
        DataOfSpinner.add("JAVA");
        DataOfSpinner.add("Math");
        DataOfSpinner.add("Electronics");

        ArrayAdapter adapterFitLayout = new ArrayAdapter(this, android.R.layout.simple_spinner_item,DataOfSpinner);
        adapterFitLayout.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

     Spinner sp1 = findViewById(R.id.spinner_course);
     sp1.setAdapter(adapterFitLayout);


    }
}