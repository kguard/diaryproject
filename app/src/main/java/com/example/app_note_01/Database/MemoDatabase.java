package com.example.app_note_01.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Memo.class},version = 1)
public abstract class MemoDatabase extends RoomDatabase {
    private static MemoDatabase database;
    private static String DATABASE_NAME ="database";
    public synchronized static MemoDatabase getInstance(Context context)
    {
        if(database==null)
        {
            database= Room.databaseBuilder(context.getApplicationContext(),MemoDatabase.class,DATABASE_NAME).allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
        return database;
    }
    public abstract MemoDAO memoDAO();
}
