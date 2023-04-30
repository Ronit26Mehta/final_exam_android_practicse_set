package com.example.practise_layout5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t1;
Button b1,b2;
String s1 ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        t1 = findViewById(R.id.text);
    }
    public void change(View view){
        s1 = "f society";
        t1.setText(s1);
    }
    public void normal(View view){
        s1 = "hello world!";
        t1.setText(s1);
    }
}