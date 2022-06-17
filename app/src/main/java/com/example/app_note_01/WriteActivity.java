package com.example.app_note_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.app_note_01.Database.Memo;
import com.example.app_note_01.Database.MemoDatabase;

import java.util.ArrayList;
import java.util.List;

public class WriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
        EditText editText = findViewById(R.id.edittext1);
        EditText editText1 = findViewById(R.id.edittext2);
        Button buttonSave = findViewById(R.id.button);
        Button buttonCancel = findViewById(R.id.button2);
        List<Memo> list=new ArrayList<>();
        MemoDatabase database=MemoDatabase.getInstance(this);
        list= (List<Memo>) database.memoDAO().getAll();
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title=editText.getText().toString();
                String contents=editText1.getText().toString();
                Memo memo=new Memo();
                memo.setTitle(title);
                memo.setContents(contents);
                database.memoDAO().insert(memo);
                MainActivity.adapter.notifyDataSetChanged();
                finish();
            }
        });
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}