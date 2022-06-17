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

    public String getTitle() {return title;}
    public String getContents() {return contents;}
    public int getId(){return id;}
    public void setTitle(String a){this.title=a;}
    public void setContents(String a){this.contents=a;}
}

