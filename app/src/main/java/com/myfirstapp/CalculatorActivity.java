package com.myfirstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    EditText orderAmount;
    TextView seekText;
    SeekBar seekBar;
    Button sumButton;
    TextView sumTip;
    TextView sumOrder;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        orderAmount = findViewById(R.id.orderAmount);
        seekText = findViewById(R.id.seekText);
        seekBar = findViewById(R.id.seekBar);
        sumButton = findViewById(R.id.sumButton);
        sumTip = findViewById(R.id.sumTip);
        sumOrder = findViewById(R.id.sumOrder);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                int stepSize = 5;
                progress = Math.round(progress / stepSize) * stepSize;
                seekBar.setProgress(progress);
                seekText.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sumButton.setOnClickListener(view -> {
            double order = Double.parseDouble(orderAmount.getText().toString());
            int percentTip = Integer.parseInt(seekText.getText().toString());

            sumTip.setText(String.valueOf(order * percentTip / 100.0));
            sumOrder.setText(String.valueOf(order + (order * percentTip / 100.0)));
        });

    }
}
