package miwok.android.example.com.habbittracker.data;

import android.provider.BaseColumns;

/**
 * Created by Paul on 05-Jul-17.
 */

public class HabitContract {

    private HabitContract() {

    }

    public static final class HabitEntry implements BaseColumns {

        public final static String TABLE_NAME = "habits";


        public final static String _ID = BaseColumns._ID;


        public final static String COLUMN_HABIT_NAME ="name";


        public final static String COLUMN_HABBIT_DESCRIPTION = "desc";

        public final static String COLUMN_NUMBER_OF_TIMES = "numberOFTimes";


    }
}
