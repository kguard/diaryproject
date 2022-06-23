package com.example.app_note_01.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MemoDAO {
    @Query("SELECT * from Memo")
    List<Memo> getAll();
    //@Query("SELECT title from Memo")
    //List<Memo> getTitle();
   // @Query("SELECT contents from Memo")
    //List<Memo> getContents();
    @Insert
    void insert(Memo...memos);
    //@Delete
    //void delete(Memo...memos);
   // @Update
    //void update(Memo...memos);


}
