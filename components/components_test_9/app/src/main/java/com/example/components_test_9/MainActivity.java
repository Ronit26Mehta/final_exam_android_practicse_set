package com.example.components_test_9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
Button btn;
ProgressDialog pdn;
int my_progress = 0;
Thread th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);

    }
    public void display(View view){
        pdn = new ProgressDialog(view.getContext());
        pdn.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pdn.setMessage("file downloading");
        pdn.setMax(100);
        pdn.setProgress(40);
        pdn.setIndeterminate(true);
        pdn.setCancelable(true);
        pdn.show();

    }


}