package com.example.notas_estudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BOTON_LOGIN;

    EditText USUARIO, CONTRASEÑA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BOTON_LOGIN = (Button)findViewById(R.id.Boton_Ingresar);
        USUARIO = (EditText)findViewById(R.id.Usuario);
        CONTRASEÑA = (EditText)findViewById(R.id.Contraseña);

        BOTON_LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = USUARIO.getText().toString();
                String contra = CONTRASEÑA.getText().toString();

                if ( usuario.equals("Luz Daneira") && contra.equals("1234")) {
                    Intent i = new Intent(MainActivity.this, Pantalla_2.class);
                    i.putExtra("TRAER_PROFE", USUARIO.getText().toString());
                    startActivity(i);

                } else if (usuario.equals("")) {
                    Toast.makeText(MainActivity.this, "Debe ingresar el usuario", Toast.LENGTH_SHORT).show();

                }  else if (contra.equals("")) {
                    Toast.makeText(MainActivity.this, "Debe ingresar la contraseña", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "Usuario y/o contraseña incorrectos :(", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}