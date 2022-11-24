package com.example.evidenciafinalv5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
    super(context,name,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos){

        BaseDeDatos.execSQL("create  table articulos(numero int primary key, nombre text,existencia int)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){

    }

}
