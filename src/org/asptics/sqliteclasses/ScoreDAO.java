package org.asptics.sqliteclasses;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ScoreDAO {
	
	private String[] columns={"COL_EMAIL","COL_USERNAME","COL_SCORE"};
	
	SQLiteDatabase database;
	Context context;
	
	public ScoreDAO(Context context){
		this.context=context;
	}
	
	public void open(){
		SQLiteHelper dbHelper = new SQLiteHelper(context);
		database = dbHelper.getReadableDatabase();
	}
	
	public UserScore insert(UserScore score){
		ContentValues values = new ContentValues();
		values.put(columns[0], score.getEmail());
		values.put(columns[1], score.getUserName());
		values.put(columns[2], score.getHighScore());
		return null;
	}
}
