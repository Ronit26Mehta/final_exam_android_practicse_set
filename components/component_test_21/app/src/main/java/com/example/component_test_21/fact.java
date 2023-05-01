package com.example.component_test_21;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fact extends AppCompatActivity {
   String s1;
    int n1,total=1;
    TextView txt;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fact);
        txt = findViewById(R.id.textview);
        s1 = getIntent().getStringExtra("value");
        n1 = Integer.parseInt(String.valueOf(s1));
        for(int i = 1;i<=n1;i++){
            total = total * i;
        }
        txt.setText("the factorial is :"+total);
    }
}
