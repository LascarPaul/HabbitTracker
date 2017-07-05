package miwok.android.example.com.habbittracker.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Paul on 05-Jul-17.
 */

public class HabitDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "habitTracker";

    private static final int DATABASE_VERSION = 1;

    public HabitDbHelper(Context c) {
        super(c, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_HABITS_TABLE = "CREATE TABLE " + HabitContract.HabitEntry.TABLE_NAME + " ("
                + HabitContract.HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabitContract.HabitEntry.COLUMN_HABIT_NAME + " TEXT NOT NULL, "
                + HabitContract.HabitEntry.COLUMN_HABBIT_DESCRIPTION + " TEXT,"
                + HabitContract.HabitEntry.COLUMN_NUMBER_OF_TIMES + " INTEGER NOT NULL DEFAULT 0);";


        db.execSQL(SQL_CREATE_HABITS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
