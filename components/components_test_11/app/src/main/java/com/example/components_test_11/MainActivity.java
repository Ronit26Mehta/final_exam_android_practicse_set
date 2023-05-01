package com.example.components_test_11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String[] arr ={"1","2","3","4","5","6","7","8","9","0","\n","\n","\n","\n","\n","!","@","#","$","%","^","&","*","(",")"};
GridView g;
ArrayAdapter<String> ar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g = findViewById(R.id.grid);
        ar = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,arr);
        g.setAdapter(ar);
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "the item clicked is :"+ar.getItem(i)+"\n"+"the position is:"+(i+1), Toast.LENGTH_SHORT).show();
            }
        });

    }
}