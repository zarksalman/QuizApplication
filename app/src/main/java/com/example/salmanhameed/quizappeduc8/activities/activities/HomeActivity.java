package com.example.salmanhameed.quizappeduc8.activities.activities;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.salmanhameed.quizappeduc8.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    EditText daysEt, monthsEt, yearEt;
    ImageView ivCalender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    void initUi() {
        daysEt = findViewById(R.id.input_days);
        monthsEt = findViewById(R.id.input_month);
        yearEt = findViewById(R.id.input_year);
        ivCalender = findViewById(R.id.iv_calender);

        daysEt.setOnClickListener(this);
        monthsEt.setOnClickListener(this);
        yearEt.setOnClickListener(this);
        ivCalender.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (id == R.id.input_days || id == R.id.input_month || id == R.id.input_year || id == R.id.iv_calender) {

            DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    daysEt.setText(String.valueOf(dayOfMonth));
                    monthsEt.setText(String.valueOf(month));
                    yearEt.setText(String.valueOf(year));
                }
            };
        } else if (id == R.id.btn_start_test) {

        }
    }
}
