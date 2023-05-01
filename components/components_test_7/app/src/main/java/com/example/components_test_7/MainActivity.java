package com.example.components_test_7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioButton r1,r2,r3,r4;
Button b1;
String s1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.radiobutton);
        r2 = findViewById(R.id.radiobutton1);
        r3 = findViewById(R.id.radiobutton2);
        r4 = findViewById(R.id.radiobutton3);
        b1 = findViewById(R.id.button);
    }
    public void display(View view){
        if(r1.isChecked()){
            s1 = s1 +"\n"+r1.getText().toString()+"is checked"+"\n";

        }
        if(r2.isChecked()){
            s1 = s1 +"\n"+r2.getText().toString()+"is checked"+"\n";
        }
        if(r3.isChecked()){
            s1 = s1 +"\n"+r3.getText().toString()+"is checked"+"\n";
        }
        if(r4.isChecked()){
            s1 = s1 +"\n"+r4.getText().toString()+"is checked"+"\n";
        }
        Toast.makeText(this,s1,Toast.LENGTH_LONG).show();
    }
}