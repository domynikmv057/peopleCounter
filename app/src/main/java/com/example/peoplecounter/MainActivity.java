package com.example.peoplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    int progressValue;
    String arraySpinnerValue;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinnerContainer =  findViewById(R.id.spinnerContainer);
        TextView subTitleView = findViewById(R.id.subTitleView);
        TextView maxPeapleText = findViewById(R.id.maxPeapleText);
        SeekBar maxPeapleBar = findViewById(R.id.maxPeapleBar);
        Button buttonNextView = findViewById(R.id.buttonNextView);



        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.unidadesMercado, android.R.layout.simple_spinner_dropdown_item);
        spinnerContainer.setAdapter(adapter);




        maxPeapleBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                maxPeapleText.setText( String.valueOf(i) );
                progressValue = i;

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });
        arraySpinnerValue = String.valueOf(spinnerContainer.getSelectedItem());

        buttonNextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spinnerContainer.getSelectedItemPosition() != 0 && arraySpinnerValue != null && progressValue >= 1){
                    Toast.makeText(MainActivity.this, "Deu", Toast.LENGTH_SHORT).show();
                }else {
                Toast.makeText(MainActivity.this, "Verifique os campos, algo deu errado", Toast.LENGTH_SHORT).show();
                }

            }
        });


}
}