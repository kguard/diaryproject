package com.example.app_note_01;

public class Memo {
    private String title;
    private String contents;

    public Memo(String title, String contents){
        this.title=title;
        this.contents=contents;
    }
    public String getTitle() {return title;}
    public String getContents(){return  contents;}
}
