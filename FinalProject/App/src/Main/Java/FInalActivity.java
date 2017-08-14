package com.knyoteen.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FInalActivity extends AppCompatActivity {

    TextView text_Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        text_Hasil = (TextView)findViewById(R.id.text_hasil);
        int tangkap = getIntent().getIntExtra("lembar_3", 0);
        text_Hasil.setText("Nilai Kamu : " + tangkap);
    }
}
