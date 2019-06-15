package com.nested.dell_pc.inicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Binario extends AppCompatActivity {


    Button borrar;
    TextView b,h,o;
    EditText dec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binario);
        borrar=(Button) findViewById(R.id.borrar);
        b=(TextView)findViewById(R.id.Binario);
        h=(TextView)findViewById(R.id.Hexa);
        o=(TextView)findViewById(R.id.Octa);
        dec=(EditText)findViewById(R.id.Decimal );
        this.setTitle(R.string.conversor);
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setText("");
                dec.setText("");

            }
        });

        dec.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try{


                    if(dec.getText().length()>0) {
                        int deci=Integer.parseInt(dec.getText().toString());
                        b.setText(Integer.toBinaryString(deci));
                        h.setText(Integer.toHexString(deci));
                        o.setText(Integer.toOctalString(deci));
                    }
                    else
                    {
                        b.setText("");
                        h.setText("");
                        o.setText("");
                    }
                }
                catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Supero el limite",Toast.LENGTH_LONG).show();
                }
                //
            }

        });
    }
}