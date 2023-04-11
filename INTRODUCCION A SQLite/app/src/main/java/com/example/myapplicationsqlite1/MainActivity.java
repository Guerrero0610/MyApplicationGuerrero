package com.example.myapplicationsqlite1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText LINEAC, LINEAN, LINEAT;
    Button BOTON_REGISTRA, BOTON_CONSULTA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LINEAC = findViewById(R.id.Cedula);
        LINEAN = findViewById(R.id.Nombre);
        LINEAT = findViewById(R.id.Telefono);
        BOTON_REGISTRA = findViewById(R.id.Boton_Registra);
        BOTON_REGISTRA = findViewById(R.id.Boton_Consulta);

        BOTON_REGISTRA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resgistrar(view);
            }
        });
        BOTON_REGISTRA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Consultar(view);
            }
        });
    }
    public void Resgistrar(View view){

        BaseDatos Listar = new BaseDatos(this,"BaseDatos", null, 1);
        SQLiteDatabase BaseDatos = Listar.getWritableDatabase();
        String Cedula = LINEAC.getText().toString();
        String Nombre = LINEAN.getText().toString();
        String Telefono = LINEAT.getText().toString();

        if (!Cedula.isEmpty() && !Nombre.isEmpty() && !Telefono.isEmpty()){
            ContentValues registro = new ContentValues();
            registro.put("Cedula", Cedula);
            registro.put("Nombre", Nombre);
            registro.put("Telefono", Telefono);
            BaseDatos.insert("usuario", null, registro);
            BaseDatos.close();
            LINEAC.setText("");
            LINEAN.setText("");
            LINEAT.setText("");
            Toast.makeText(this,"Resgistro Almacenado Exitosamente", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Ingrese Correctamente Todos los Datos", Toast.LENGTH_LONG).show();
        }

    }
    public void Consultar(View view){
        Toast.makeText(this,"Estoy En Consultar", Toast.LENGTH_LONG).show();
        BaseDatos Listar = new BaseDatos(this,"BaseDatos", null,1);
        SQLiteDatabase BaseDatos = Listar.getWritableDatabase();
        String Cedula = LINEAC.getText().toString();
        if (!Cedula.isEmpty()){
            Cursor fila = BaseDatos.rawQuery("select Nombre,Telefono from usuario where Cedula="+Cedula, null);
            if (fila.moveToFirst()==true){
                LINEAN.setText(fila.getString(0));
                LINEAT.setText(fila.getString(1));
                BaseDatos.close();
            }
            else{
                Toast.makeText(this,"No Se Encontro el Usuario, Por Favor Vuelva a Intentarlo", Toast.LENGTH_LONG).show();
            }
        }
    }
}