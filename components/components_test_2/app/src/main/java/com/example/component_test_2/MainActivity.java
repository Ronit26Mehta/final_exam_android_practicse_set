package com.example.component_test_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView t1;

     String  ar[]  = {"MAD","PWP","MGT","DWM","ETI","EDE"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.auto);
        ArrayAdapter<String> arr = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,ar);
        t1.setAdapter(arr);
        t1.setThreshold(1);
    }
}