package com.knyoteen.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    int nilai = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = (RadioButton)findViewById(R.id.Radio_button_1);
        radioButton2 = (RadioButton)findViewById(R.id.Radio_button_2);
        radioButton3 = (RadioButton)findViewById(R.id.Radio_button_3);
        radioButton4 = (RadioButton)findViewById(R.id.Radio_button_4);

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nilai = 10;
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nilai = 0;
            }
        });
        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        radioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    public void button_next_satu (View view){

//        startActivity(new Intent(getApplicationContext(), Hal2.class));
        Intent pindahactivity1 = new Intent(getApplicationContext(), Hal2.class);
        pindahactivity1.putExtra("Lempar_1", nilai);
        startActivity(pindahactivity1);
    }
}
