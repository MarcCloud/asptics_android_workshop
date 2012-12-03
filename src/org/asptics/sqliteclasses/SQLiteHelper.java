package org.asptics.sqliteclasses;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;



public class SQLiteHelper extends SQLiteOpenHelper {

	private static String DB_NAME="GAME";
	private static final int version =1;
	private final static String TABLE_HIGH_SCORES="HIGH_SCORES";
	private static final String COL_EMAIL="EMAIL";
	private static final String COL_SCORE="SCORE";
	private static final String COL_USERNAME="USER_NAME";
	
	private static final String CREATE_SQL_STRING="CREATE TABLE" + TABLE_HIGH_SCORES +
												"("+COL_EMAIL+"TEXT not null,"+
												    COL_USERNAME+"TEXT not null,"+
												    COL_SCORE+"REAL not null);";
	
	public SQLiteHelper(Context context) {
		super(context, DB_NAME, null, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_SQL_STRING);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXIST" + TABLE_HIGH_SCORES);
	}

}
