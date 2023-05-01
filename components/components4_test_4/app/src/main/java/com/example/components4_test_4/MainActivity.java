package com.example.components4_test_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b1,b2,b3,b4;
String s1 ;
int n1,n2,n3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);

    }
    public void add(View view){
        n1 = Integer.parseInt(e1.getText().toString());
        n2 = Integer.parseInt(e2.getText().toString());
        n3 = n1 + n2;
        String s1 = "the result is :-"+ n3;
       Toast.makeText(this,s1,Toast.LENGTH_LONG).show();
    }
    public void sub(View view){
        n1 = Integer.parseInt(e1.getText().toString());
        n2 = Integer.parseInt(e2.getText().toString());
        n3 = n1 - n2;
        String s1 = "the result is :-"+ n3;
        Toast.makeText(this,s1,Toast.LENGTH_LONG).show();
    }
    public void mul(View view){
        n1 = Integer.parseInt(e1.getText().toString());
        n2 = Integer.parseInt(e2.getText().toString());
        n3 = n1 * n2;
        String s1 = "the result is :-"+ n3;
        Toast.makeText(this,s1,Toast.LENGTH_LONG).show();
    }
    public void div(View view){
        n1 = Integer.parseInt(e1.getText().toString());
        n2 = Integer.parseInt(e2.getText().toString());
        n3 = n1 / n2;
        String s1 = "the result is :-"+ n3;
        Toast.makeText(this,s1,Toast.LENGTH_LONG).show();
    }
}