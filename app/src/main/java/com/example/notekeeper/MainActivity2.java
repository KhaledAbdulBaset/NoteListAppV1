 package com.example.notekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

 public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        initilizeDisplayContent();
    }

    private void initilizeDisplayContent() {

        ListView listNote = findViewById(R.id.list_note);
        List<String> DataOfListNote = new ArrayList<>();
        DataOfListNote.add("Course: DataStructure"+"/n"+"Title: Stack");
        DataOfListNote.add("Course: Electronics"+"/n"+"Title: Diodes");
        DataOfListNote.add("Course: Math"+"/n"+"Title:Integration");

        ArrayAdapter adapter1 = new ArrayAdapter(MainActivity2.this, android.R.layout.simple_list_item_1,DataOfListNote);

listNote.setAdapter(adapter1);
listNote.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
});



    }
}