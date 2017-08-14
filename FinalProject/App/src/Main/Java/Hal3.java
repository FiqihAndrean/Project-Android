package com.knyoteen.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.id.edit;

public class Hal3 extends AppCompatActivity {

    int tangkap_nilai, nilai;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal3);
        tangkap_nilai = getIntent().getIntExtra("lempar_2", 0);
        nilai = tangkap_nilai;
        editText = (EditText) findViewById(R.id.edit_text_1);
    }

    public void button_next_tiga(View view) {
        String jawaban = editText.getText().toString();

        if (jawaban.equals("Andi Rubin")) {
            nilai = nilai + 80;
        } else if (jawaban.isEmpty()) {
            editText.setError("Isi Jawaban terlebih dahulu");
        } else if (!jawaban.equals("Andy Rubin")) {
            nilai = nilai + 0;
        }
        Intent lempar_3 = new Intent(getApplicationContext(), FInalActivity.class);
        lempar_3.putExtra("lempar_3", nilai);
        startActivity(lempar_3);
    }
}