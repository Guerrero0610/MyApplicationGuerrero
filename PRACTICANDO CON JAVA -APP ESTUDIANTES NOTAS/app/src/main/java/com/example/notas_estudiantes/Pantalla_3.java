package com.example.notas_estudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Pantalla_3 extends AppCompatActivity {
    ListView VER;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        VER = (ListView) findViewById(R.id.lista);

        BD_Estudiantes databaseHelper = new BD_Estudiantes(this,"BaseDatos", null,1);
        SQLiteDatabase db = databaseHelper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM estudiante", null);

        ArrayList<String> listaDatos = new ArrayList<>();

        while (cursor.moveToNext()) {
            String Nombre = cursor.getString(0);
            listaDatos.add(Nombre);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaDatos);
        VER.setAdapter(adapter);

        cursor.close();
        db.close();
    }
}