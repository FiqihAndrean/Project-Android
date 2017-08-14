package com.knyoteen.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Hal2 extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    int tangkap_nilai, nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2);

        checkBox1 = (CheckBox)findViewById(R.id.checkbox_1);
        checkBox2 = (CheckBox)findViewById(R.id.checkbox_2);
        checkBox3 = (CheckBox)findViewById(R.id.checkbox_3);
        checkBox4 = (CheckBox)findViewById(R.id.checkbox_4);

        tangkap_nilai = getIntent().getIntExtra("Lempar_1", 0);
        nilai = tangkap_nilai;
    }
    public void button_next_dua (View view){

        boolean checkbox1 = checkBox1.isChecked();
        boolean checkbox2 = checkBox2.isChecked();
        boolean checkbox3 = checkBox3.isChecked();
        boolean checkbox4 = checkBox4.isChecked();

        int tambah = hitungNilaiCheckBox(checkbox1, checkbox2, checkbox3, checkbox4);
        Intent lempar_lagi = new Intent(getApplicationContext(), Hal3.class);
        lempar_lagi.putExtra("lempar_2", tambah);
        startActivity(lempar_lagi);
    }

    private int hitungNilaiCheckBox(boolean checkbox1, boolean checkbox2, boolean checkbox3, boolean checkbox4) {

        if (checkbox1){
            nilai = nilai + 5;
        }
        if (checkbox2){
            nilai = nilai + 5;
        }
        if (checkbox3){
            nilai = nilai + 0;
        }
        if (checkbox4){
            nilai = nilai + 0;
        }
        return nilai;
    }
}
