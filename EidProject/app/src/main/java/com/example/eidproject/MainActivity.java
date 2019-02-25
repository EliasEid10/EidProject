package com.example.eidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnDetect;
    private Button btnClear;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDetect = (Button) findViewById(R.id.btnDetect);
        btnClear =(Button) findViewById(R.id.btnClear);
        tvResult = (TextView) findViewById(R.id.tvResult);

    }

    private void btnDetect_OnClick(android.view.View v)
    {

    }

    private void btnClear_OnClick(android.view.View v){

    }
}
