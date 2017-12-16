package com.example.alirahmat.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtA,scoreA, txtB , scoreB ;
    Button upA,downA , upB , downB;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtA = (TextView) findViewById(R.id.txt_a);
        scoreA = (TextView) findViewById(R.id.txt_score_a);
        txtB = (TextView) findViewById(R.id.txt_b);
        scoreB = (TextView) findViewById(R.id.txt_score_b);

        upA = (Button) findViewById(R.id.btn_up_a);
        upB = (Button) findViewById(R.id.btn_up_b);

        downA = (Button) findViewById(R.id.btn_down_a);
        downB = (Button) findViewById(R.id.btn_down_b);


        //button up A di tekan maka socre nambah 1
        upA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                scoreA.setText(""+i);
            }
        });


        //button downB di tekan maka score berkurang 1
        downA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                scoreA.setText(""+i);
            }
        });


        //button up B di tekan maka socre nambah 1
        upA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                scoreB.setText(""+i);
            }
        });


        //button downB di tekan maka score berkurang 1
        downA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                scoreB.setText(""+i);
            }
        });


    }
}
