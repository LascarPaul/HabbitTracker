package miwok.android.example.com.habbittracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import miwok.android.example.com.habbittracker.data.HabitContract;
import miwok.android.example.com.habbittracker.data.HabitDbHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void insertHabit(String name, String description, int noOfTimes){

        HabitDbHelper mDbHelper = new HabitDbHelper(this);
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        ContentValues habiValues = new ContentValues();
        habiValues.put(HabitContract.HabitEntry.COLUMN_HABIT_NAME, name);
        habiValues.put(HabitContract.HabitEntry.COLUMN_HABBIT_DESCRIPTION, description);
        habiValues.put(HabitContract.HabitEntry.COLUMN_NUMBER_OF_TIMES, noOfTimes);
        db.insert(HabitContract.HabitEntry.TABLE_NAME, null, habiValues);
    }

    private Cursor readData() {
        HabitDbHelper mDbHelper = new HabitDbHelper(this);
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] projection = {
                HabitContract.HabitEntry._ID,
                HabitContract.HabitEntry.COLUMN_HABIT_NAME,
                HabitContract.HabitEntry.COLUMN_HABBIT_DESCRIPTION,
                HabitContract.HabitEntry.COLUMN_NUMBER_OF_TIMES };

        Cursor cursor = db.query(
                HabitContract.HabitEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null);

        return cursor;
        }
    }




