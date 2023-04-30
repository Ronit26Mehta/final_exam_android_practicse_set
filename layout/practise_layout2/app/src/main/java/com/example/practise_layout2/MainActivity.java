package com.example.practise_layout2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button b1;
EditText e1;
String s1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       e1 = findViewById(R.id.edittext);
       b1 = findViewById(R.id.button);


    }
    public void display(View view){
        s1 = e1.getText().toString();
        Toast.makeText(this,s1,Toast.LENGTH_LONG).show();
    }
}