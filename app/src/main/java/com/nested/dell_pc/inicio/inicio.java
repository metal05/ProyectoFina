package com.nested.dell_pc.inicio;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicio extends AppCompatActivity {

    Button boton;
    private Typeface nuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


    }
    public void siguiente(View view)
    {
        Intent sig=new Intent(this,menu.class);
        startActivity(sig);
    }


}
