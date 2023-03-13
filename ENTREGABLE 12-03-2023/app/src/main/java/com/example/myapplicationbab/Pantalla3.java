package com.example.myapplicationbab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Pantalla3 extends AppCompatActivity {
    ImageView primero, segundo, tercero, primero1, segundo1, tercero1, primero2, segundo2, tercero2;
    EditText ENDIAS;
    Button VERLO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        primero = (ImageView)findViewById(R.id.primero1);
        primero1 = (ImageView)findViewById(R.id.primero11);
        primero2 = (ImageView)findViewById(R.id.primero111);
        segundo = (ImageView)findViewById(R.id.segundo1);
        segundo1 = (ImageView)findViewById(R.id.segundo11);
        segundo2 = (ImageView)findViewById(R.id.segundo111);
        tercero = (ImageView)findViewById(R.id.tercero1);
        tercero1 = (ImageView)findViewById(R.id.tercero11);
        tercero2 = (ImageView)findViewById(R.id.tercero111);
        ENDIAS = (EditText) findViewById(R.id.Diasl);
        VERLO = (Button)findViewById(R.id.Muestrame);

        String Recibe = getIntent().getStringExtra("ENDIAS");

        Recibimos(Recibe);

        VERLO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String nume = getIntent().getStringExtra("ENDIAS");
                int comparar = Integer.parseInt(ENDIAS.getText().toString());

                if ( comparar >= 0 && comparar<=31) {
                    primero.setBackgroundResource(R.mipmap.primero);
                    primero.setVisibility(View.VISIBLE);

                } else if (comparar >= 32 && comparar<=62){
                    segundo.setBackgroundResource(R.mipmap.segundo);
                    segundo.setVisibility(View.VISIBLE);

                }else if (comparar >= 63 && comparar<=93){
                    tercero.setBackgroundResource(R.mipmap.tercero);
                    tercero.setVisibility(View.VISIBLE);

                }else if (comparar >= 94 && comparar<=124){
                    primero1.setBackgroundResource(R.mipmap.primero1);
                    primero1.setVisibility(View.VISIBLE);

                }else if (comparar >= 125 && comparar<=155){
                    segundo1.setBackgroundResource(R.mipmap.segundo1);
                    segundo1.setVisibility(View.VISIBLE);

                }else if (comparar >= 156 && comparar<=186){
                    tercero1.setBackgroundResource(R.mipmap.tercero1);
                    tercero1.setVisibility(View.VISIBLE);

                }else if (comparar >= 187 && comparar<=217){
                    primero2.setBackgroundResource(R.mipmap.primero2);
                    primero2.setVisibility(View.VISIBLE);

                }else if (comparar >= 218 && comparar<=248){
                    segundo2.setBackgroundResource(R.mipmap.segundo2);
                    segundo2.setVisibility(View.VISIBLE);

                }else if (comparar >= 249 && comparar<=280){
                    tercero2.setBackgroundResource(R.mipmap.tercero2);
                    tercero2.setVisibility(View.VISIBLE);

                }else {

                }


            }
        });
    }
    public void Recibimos(String Recibe){

        ENDIAS.setText(Recibe);


    }
}