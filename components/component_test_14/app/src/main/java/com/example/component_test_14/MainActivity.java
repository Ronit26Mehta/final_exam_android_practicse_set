package com.example.component_test_14;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);

    }
    public void display(View view){
     showCustomAlert();
    }
    public void showCustomAlert(){
        Context context = getApplicationContext();
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.layout, findViewById(R.id.lay));
        Toast t = new Toast(context);
        t.setGravity(Gravity.CENTER | Gravity.START,0,0);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(view);
        t.show();
    }
}