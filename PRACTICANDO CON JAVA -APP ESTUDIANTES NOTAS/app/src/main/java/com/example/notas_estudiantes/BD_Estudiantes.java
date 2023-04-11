package com.example.notas_estudiantes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BD_Estudiantes extends SQLiteOpenHelper {

    public BD_Estudiantes(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDatos) {
        BaseDatos.execSQL("create table estudiante (cedula int primary key, Nota1 int, Nota2 int, Nota3 int, Nota4 int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase BaseDatos, int i, int i1) {

    }
}
