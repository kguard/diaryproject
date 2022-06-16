package com.example.app_note_01.Database;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Memo implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String title;
    public String contents;
}