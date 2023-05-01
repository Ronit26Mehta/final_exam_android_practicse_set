package com.example.component_test_20;

import static android.content.Intent.ACTION_DIAL;
import static android.content.Intent.ACTION_VIEW;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et1;
Button btn1;
String url;
Intent i;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.phone);
        btn1 = findViewById(R.id.call);
    }
    public void call (View view){
        url = et1.getText().toString();

        i = new Intent(ACTION_DIAL);
        startActivity(i);

    }
}