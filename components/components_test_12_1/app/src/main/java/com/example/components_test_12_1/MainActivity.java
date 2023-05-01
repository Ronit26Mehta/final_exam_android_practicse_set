package com.example.components_test_12_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        img = findViewById(R.id.image);
    }
    public void display(View view){
        img.setImageResource(R.drawable.ic_launcher_foreground);
        Toast.makeText(this,"the image is changed", Toast.LENGTH_LONG).show();
    }
}