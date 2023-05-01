package com.example.component_test_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText eti;
Button bt1;
String s1;
Intent i ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eti = findViewById(R.id.factnum);
        bt1 = findViewById(R.id.fact);
    }
    public void calc(View view){
        s1 = eti.getText().toString();
        i = new Intent(MainActivity.this,fact.class);
        i.putExtra("value",s1);
        startActivity(i);
    }
}