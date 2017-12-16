package com.example.alirahmat.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtA,scoreA, txtB , scoreB ;
    Button upA,downA , upB , downB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtA = (TextView) findViewById(R.id.txt_a);
        scoreA = (TextView) findViewById(R.id.txt_score_a);


    }
}
