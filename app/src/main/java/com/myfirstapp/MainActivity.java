package com.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Info", "Отработал метод onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Info", "Отработал метод onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Info", "Отработал метод onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Info", "Отработал метод onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Info", "Отработал метод onDestroy()");
    }



}