package com.example.components_test_16;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
TimePicker t3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t3 = findViewById(R.id.timepicker3);
        t3.setIs24HourView(Boolean.TRUE);
    }
}