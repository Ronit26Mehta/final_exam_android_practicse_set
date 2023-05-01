package com.example.components_test_5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b1 ;
String s1="ronit",s2="123",s3="log in successful",s4="log in unsuccessful";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextTextPersonName);
        e2 = findViewById(R.id.editTextTextPersonName2);
        b1 = findViewById(R.id.button);
    }
    public void log_in(View view){
        if(e1.getText().toString().equals(s1) && e2.getText().toString().equals(s2)){
            Toast.makeText(this,s3,Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,s4,Toast.LENGTH_LONG).show();
        }
    }
}