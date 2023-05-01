package com.example.components_test_17;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener , TimePickerDialog.OnTimeSetListener {
EditText e1,e2;
Button b1,b2;
Calendar c;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2= findViewById(R.id.button2);
        e1 = findViewById(R.id.date);
        e2 = findViewById(R.id.time);
    }
  public void date(View view){
        showDatePickerDialog();
  }
  public void time(View view){
        showTimePickerDialog();
  }
  public void showDatePickerDialog(){
          c = Calendar.getInstance();
          DatePickerDialog db = new DatePickerDialog(this,this,c.get(Calendar.DAY_OF_MONTH),c.get(Calendar.MONTH),c.get(Calendar.YEAR));
          db.setCancelable(true);
          db.show();

  }
  public void showTimePickerDialog(){
   c = Calendar.getInstance();
   TimePickerDialog td = new TimePickerDialog(this,this,c.get(Calendar.HOUR_OF_DAY),c.get(Calendar.MINUTE),true);
   td.setCancelable(true);
   td.show();
  }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int month, int i2) {
        month += 1;
        String date = i + "-"+ month+"-"+i2;
        e1.setText(date);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {
     String time = i + "-" + i1;
     e2.setText(time);
    }
}