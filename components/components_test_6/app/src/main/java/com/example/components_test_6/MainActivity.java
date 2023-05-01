package com.example.components_test_6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox c1, c2 ,c3 ,c4;
StringBuilder s1 = new StringBuilder();
String s_1 = "the checkBoxes selected are:"+"\n";
Button b1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        b1 = findViewById(R.id.button);
        s1.append(s_1);
    }
    public void display(View view){
       if(c1.isChecked()){
           String s2 = "the c1 is checked";
           s1.append(s2);
       }
        if(c2.isChecked()){
            String s2 = "the c2 is checked";
            s1.append(s2);
        }
        if(c3.isChecked()){
            String s2 = "the c3 is checked";
            s1.append(s2);
        }
        if(c4.isChecked()){
            String s2 = "the c4 is checked";
            s1.append(s2);
        }
        Toast.makeText(this,s1,Toast.LENGTH_LONG).show();
    }
}