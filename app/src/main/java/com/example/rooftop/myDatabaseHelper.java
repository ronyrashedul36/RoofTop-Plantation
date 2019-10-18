package com.example.rooftop;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class myDatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="student.db";
    private static final String TABLE_NAME="student_details";
    private static final String ID="_id";
    private static final String TITLE="title";
    private static final String OWNER="owner";
    private static final String LOCATION="location";
    private static final String CONTACT="contact";
    private static final String DESCRIPTION="description";
    private static final int VERSION_NUMBER=1;
    private static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+" ( "+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+TITLE+" VARCHAR(100),"+OWNER+" VARCHAR(100),"+LOCATION+" VARCHAR(100),"+CONTACT+" VARCHAR(100),"+DESCRIPTION+" VARCHAR(100));";
    private static final String select_all="SELECT * FROM "+TABLE_NAME;
    private Context context;


    public myDatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION_NUMBER);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            Toast.makeText(context,"Oncreate is called",Toast.LENGTH_LONG).show();
            sqLiteDatabase.execSQL(CREATE_TABLE);
        }
        catch (Exception e)
        {
            Toast.makeText(context,"Exception " + e,Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        try{
            Toast.makeText(context,"Onupgrade is called",Toast.LENGTH_LONG).show();
            sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS "+TABLE_NAME);
            onCreate(sqLiteDatabase);
        }
        catch (Exception e) {
            Toast.makeText(context,"Exception " + e,Toast.LENGTH_LONG).show();
        }
    }
    public long insertData(String title,String owner,String location,String contact,String description){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(TITLE,title);
        contentValues.put(OWNER,owner);
        contentValues.put(LOCATION,location);
        contentValues.put(CONTACT,contact);
        contentValues.put(DESCRIPTION,description);
        long rowid=sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        return rowid;
    }

    public Cursor displayAllData(){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery(select_all,null);
        return cursor;

    }

}