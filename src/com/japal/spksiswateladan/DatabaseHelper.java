package com.japal.spksiswateladan;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper{
	
	
	private static final String LOG = "DatabaseHelper";
	private static final int DATABASE_VERSION =1;
	private static final String DATABASE_NAME = "SPKTeladan";
	
	private static final String table_siswa = "siswa";
	
	private static final String Key_id = "id";
	private static final String Key_thn = "thn";
	private static final String Key_kls = "kls";
	private static final String Key_nama = "nama";
	private static final String Key_k1 = "k1";
	private static final String Key_k2 = "k2";
	private static final String Key_k3 = "k3";
	private static final String Key_k4 = "k4";
	private static final String Key_k5 = "k5";

	public DatabaseHelper(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String CREATE_SISWA_TABLE = "Create table " + table_siswa + "("
				+ Key_id + " INTEGER PRIMARY KEY," + Key_thn + " INTEGER,"
				+ Key_kls + " TEXT," + Key_nama + " TEXT," + Key_k1 + " INTEGER,"
				+ Key_k2 + " INTEGER," + Key_k3 + " INTEGER," + Key_k4 + " INTEGER,"
				+ Key_k5 + " INTEGER" + ")";
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS " + table_siswa);
		
		onCreate(db);	
	}
	
	public void addSiswa(Siswa siswa){
		SQLiteDatabase db = this.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		values.put(Key_thn, siswa.get_thn());
		values.put(Key_kls, siswa.get_kls());
		values.put(Key_nama, siswa.get_nama());
		values.put(Key_k1, siswa.get_k1());
		values.put(Key_k2, siswa.get_k2());
		values.put(Key_k3, siswa.get_k3());
		values.put(Key_k4, siswa.get_k4());
		values.put(Key_k5, siswa.get_k5());
		
		db.insert(table_siswa, null, values);
		db.close();
		
	}
	
	
}
