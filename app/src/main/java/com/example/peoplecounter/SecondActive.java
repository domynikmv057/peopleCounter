package com.example.peoplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_active);

        TextView nameUnidade = findViewById(R.id.nameUnidade);

        Intent intent = getIntent();

        intent.getIntExtra("progressValue", 0);
        intent.getStringExtra("arraySpinnerValue");

        nameUnidade.setText(String.valueOf(intent.getStringExtra("arraySpinnerValue")));
    }
}