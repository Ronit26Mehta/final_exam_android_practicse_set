package com.example.components_test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText t1 , t2;
Button b1;
String s1,s2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.editTextTextPersonName);
        t2 = findViewById(R.id.editTextTextPersonName2);
        b1 = findViewById(R.id.button);
    }
    public void display(View view){
        s1 = t1.getText().toString();
        s2 = t2.getText().toString();
        String s3 = "the details are:"+"\n"+"the name:"+s1+"\n"+"the roll no:"+s2+"\n";
        Toast.makeText(this,s3,Toast.LENGTH_LONG).show();
    }
}