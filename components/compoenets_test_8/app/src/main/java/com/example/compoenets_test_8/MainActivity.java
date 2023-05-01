package com.example.compoenets_test_8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
ProgressBar p1;
Button b1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = findViewById(R.id.progress);
        b1 = findViewById(R.id.button);

    }
    public void display(View view){
        p1.setVisibility(View.VISIBLE);
    }
}