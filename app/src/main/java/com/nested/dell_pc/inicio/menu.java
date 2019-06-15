package com.nested.dell_pc.inicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void siguiente(View view)
    {
        Intent sig=new Intent(this,Binario.class);
        startActivity(sig);
    }

    public void siguiente2(View view)
    {
        Intent sig2=new Intent(this,FormulaActivity.class);
        startActivity(sig2);
    }

    public void siguiente3(View view)
    {
        Intent sig3=new Intent(this,Resistencia.class);
        startActivity(sig3);
    }

    public void siguiente4(View view)
    {
        Intent sig4=new Intent(this,calculadora.class);
        startActivity(sig4);
    }
}
