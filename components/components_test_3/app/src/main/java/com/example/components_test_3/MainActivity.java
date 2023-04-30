package com.example.components_test_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton b1;
Button b2;
TextView t1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.toggleButton);
        b2 = findViewById(R.id.button);
        t1 = findViewById(R.id.textView);

    }
    public void display(View view){
        if(b1.isChecked()){
            String s1 = "the bluetooth is on";
            t1.setText(s1);
        }
        else{
            String s1 = "the bluetooth is off";
            t1.setText(s1);

        }
    }
}