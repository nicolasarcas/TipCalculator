package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView amountTextView;
    private TextView percentTextView;
    private TextView totalTextView;
    private TextView tipTextView;

    private EditText amountEditText;

    private SeekBar percentSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //criando a arvore

        amountTextView = findViewById(R.id.amountTextView);
        percentTextView = findViewById(R.id.percentTextView);
        totalTextView = findViewById(R.id.totalTextView);
        tipTextView = findViewById(R.id.tipTextView);
        amountEditText = findViewById(R.id.amountEditText);
        percentSeekBar = findViewById(R.id.percentSeekBar);

    }

}
