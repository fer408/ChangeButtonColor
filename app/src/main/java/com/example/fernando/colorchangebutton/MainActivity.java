package com.example.fernando.colorchangebutton;

import android.graphics.Color;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    LinearLayout background;
    Button btnBlack;
    Button btnSilver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (LinearLayout)findViewById(R.id.background);
        btnBlack = (Button)findViewById(R.id.btnBlack);
        btnSilver = (Button)findViewById(R.id.btnSilver);

        btnBlack.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            background.setBackgroundColor(Color.parseColor("#000000"));

        }

        });

        btnSilver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                background.setBackgroundColor(Color.parseColor("#ababaf"));

            }

        });



    }



}
