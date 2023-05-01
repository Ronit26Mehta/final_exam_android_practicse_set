package com.example.components_test_10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView list;
String [] ar ={"java","python","php","c","c++","asm","vb.net","html","css","js","sql"};
ArrayAdapter<String> arr ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listview);
        arr = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, ar);
        list.setAdapter(arr);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "the clicked item is: " + arr.getItem(i)+"the position is :"+(i+1), Toast.LENGTH_SHORT).show();
            }
        });
    }

}