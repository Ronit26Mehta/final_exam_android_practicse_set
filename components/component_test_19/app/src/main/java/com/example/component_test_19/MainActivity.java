package com.example.component_test_19;

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
Intent i ;
String Url;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.url);
        btn1 = findViewById(R.id.navigate);
    }
    public void navigate(View view){
        Url = et1.getText().toString();
        i = new Intent(Intent.ACTION_VIEW, Uri.parse(Url));
        startActivity(i);
    }
}