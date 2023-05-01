package com.example.components_test_15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox c1,c2,c3;
Button b1;
String s1 ;
int total ,n1,n2,n3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.checkbox1);
        c2 = findViewById(R.id.checkbox2);
        c3 = findViewById(R.id.checkbox3);
        b1 = findViewById(R.id.button);
    }
    public void display(View view){
        s1 = "the order is :-"+"\n";
        if(c1.isChecked()){
            s1 = s1 +"\n"+ " burger : 150"+"\n";
            n1= 150;
            total =  total + n1;
        }
        if(c2.isChecked()){
            s1 = s1 + "\n"+" pizza : 200"+"\n";
            n2= 200;
            total =  total + n2;
        }
        if(c3.isChecked()){
            s1 = s1 + "\n"+" coffee : 50"+"\n";
            n3= 50;
            total =  total + n3;
        }
        showCustomAlert();
    }
    public void showCustomAlert(){
        Context context = getApplicationContext();
        Toast t = new Toast(context);
        t.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
        t.setText(s1+"\n"+"the total is :"+total);
        t.setDuration(Toast.LENGTH_LONG);
        t.show();
    }
}