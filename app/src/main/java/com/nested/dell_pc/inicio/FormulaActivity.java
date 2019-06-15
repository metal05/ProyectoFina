package com.nested.dell_pc.inicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormulaActivity extends AppCompatActivity {

    Button btnmat,btnfis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula);

        btnmat = (Button)findViewById(R.id.BTNmat);
        btnfis = (Button)findViewById(R.id.BTNfis);
        this.setTitle(R.string.formulas);
        final Intent intent = new Intent(this, MateActivity.class);
        final Intent intent2 = new Intent(this, FisicaActivity.class);

        btnmat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        btnfis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }
}
