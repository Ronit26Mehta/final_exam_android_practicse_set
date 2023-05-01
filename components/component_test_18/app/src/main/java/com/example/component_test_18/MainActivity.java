package com.example.component_test_18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show();
        Log.d("the lifecycle","onCreate");
    }
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show();
        Log.d("the lifecycle","onStart");
    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();
        Log.d("the lifecycle","onResume");
    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show();
        Log.d("the lifecycle","onRestart");
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();
        Log.d("the lifecycle","onPause");
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();
        Log.d("the lifecycle","onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
        Log.d("the lifecycle","onDestroy");
    }
}