package edu.ncsu.csc.bucketlist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "BucketLists.db";
    public static final String BUCKETS_TABLE_NAME = "buckets";
    public static final String BUCKETS_COLUMN_ID = "id";
    public static final String BUCKETS_COLUMN_NAME = "name";
    public static final String BUCKETS_COLUMN_LATITUDE = "latitude";
    public static final String BUCKETS_COLUMN_LONGITUDE = "longitude";
    public static final String BUCKETS_COLUMN_DESCRIPTION = "desc";
    //public static final String CONTACTS_COLUMN_CITY = "place";
    //public static final String CONTACTS_COLUMN_PHONE = "phone";

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(
                "create table buckets " +
                "(id integer primary key, name text, latitude text, longitude text, desc text)"

        );


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS buckets");
        onCreate(db);
    }
    public boolean addBucket(String name, String latitude, String longitude, String desc)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("name", name);
        contentValues.put("latitude", latitude);
        contentValues.put("longitude", longitude);
        contentValues.put("desc", desc);
        //contentValues.put("place", place);

        db.insert("buckets", null, contentValues);
        return true;
    }

    public Cursor getData(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from buckets where id="+id+"", null );
        return res;
    }
    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, BUCKETS_TABLE_NAME);
        return numRows;
    }

    public boolean updateBucket (Integer id, String name, String latitude, String longitude, String desc)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("latitude", latitude);
        contentValues.put("longitude", longitude);
        contentValues.put("desc", desc);
        //contentValues.put("place", place);
        db.update("buckets", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }

    public Integer deleteBucket (Integer id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("buckets",
                "id = ? ",
                new String[] { Integer.toString(id) });
    }

    public ArrayList getAllBuckets()
    {
        ArrayList array_list = new ArrayList();
        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from buckets", null );
        res.moveToFirst();
        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(BUCKETS_COLUMN_NAME)));
            res.moveToNext();
        }
        return array_list;
    }



}