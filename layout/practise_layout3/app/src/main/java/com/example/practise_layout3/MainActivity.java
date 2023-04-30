package com.example.practise_layout3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4;

String s2 ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);

    }
    public void press(View view){
        s2 = b1.getText().toString();
        Toast.makeText(this,s2,Toast.LENGTH_LONG).show();
        s2 = b2.getText().toString();
        Toast.makeText(this,s2,Toast.LENGTH_LONG).show();
        s2 = b4.getText().toString();
        Toast.makeText(this,s2,Toast.LENGTH_LONG).show();
        s2 = b3.getText().toString();

        Toast.makeText(this,s2,Toast.LENGTH_LONG).show();
    }
}