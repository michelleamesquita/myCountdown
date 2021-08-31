package com.example.mycountdownnewyear;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;

import java.util.Calendar;
import java.util.Date;

import cn.iwgang.countdownview.CountdownView;


public class MainActivity extends AppCompatActivity {

//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.DAY_OF_MONTH, 16);

        String pickerDateString = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView tvDatePicker = findViewById(R.id.textViewContent);
        CountdownView myCountdownView = findViewById(R.id.countdownView);

        try {
            tvDatePicker.setText(pickerDateString);
            Date now = new Date();

            long currentDate = now.getTime();
            long pickerDate = calendar.getTimeInMillis();
            long countDownToPickerDate = pickerDate - currentDate;
            myCountdownView.start(countDownToPickerDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    }
