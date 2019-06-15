package com.nested.dell_pc.inicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MateActivity extends AppCompatActivity {

    ImageView contenedor;
    Button btnsig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mate);
        this.setTitle(R.string.formulas);
        contenedor = (ImageView) findViewById(R.id.contenedor);
        btnsig = (Button) findViewById(R.id.BTNsig);
        btnsig.setOnClickListener(new View.OnClickListener() {
            Integer c=0;
            @Override
            public void onClick(View v) {
                for(int i=0;i<6;i++){
                    if(c%8==0){
                        contenedor.setImageResource(R.drawable.deri);
                    }
                    else if(c%8==1){
                        contenedor.setImageResource(R.drawable.facto);
                    }
                    if(c%8==2){
                        contenedor.setImageResource(R.drawable.loga);
                    }
                    else if(c%8==3){
                        contenedor.setImageResource(R.drawable.sig);
                    }
                    if(c%8==4){
                        contenedor.setImageResource(R.drawable.teo);
                    }
                    else if (c%8==5){
                        contenedor.setImageResource(R.drawable.trigo);
                    }
                    if(c%8==6){
                        contenedor.setImageResource(R.drawable.algebra);
                    }
                    else if (c%8==7){
                        contenedor.setImageResource(R.drawable.fig);
                    }
                }
                c++;
            }
        });
    }
}
