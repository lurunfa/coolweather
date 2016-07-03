package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 构建表的帮助类
 * Created by fa on 2016/7/2.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    //创建省份表SQL
    public static final String CREATE_PROVINCE = "create table Province (" +
            "id integer primary key autoincrement," +
            "province_name text," +
            "province_code text)";

    //创建城市表SQL
    public static final String CREATE_CITY = "create table City (" +
            "id integer primary key autoincrement," +
            "city_name text," +
            "city_code text," +
            "province_id integer)";

    //创建国家表SQL
    public static final String CREATE_COUNTRY = "create table Country (" +
            "id integer primary key autoincrement," +
            "country_name text," +
            "country_code text," +
            "city_id integer)";



    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTRY);
        db.execSQL(CREATE_PROVINCE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
