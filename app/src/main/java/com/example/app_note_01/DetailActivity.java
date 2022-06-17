package com.example.app_note_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        EditText titleText = findViewById(R.id.titleEditText);
        EditText contentText = findViewById(R.id.contentEditText);
        Button delbutton = findViewById(R.id.delbutton);
        Button editbutton = findViewById(R.id.editbutton);
        Button finButton = findViewById(R.id.finbutton);
        //boolean EditMode = false;

        titleText.setText("이거는 제목이구요");
        contentText.setText("이거는 본문입니다.");
        delbutton.setVisibility(View.VISIBLE);
        editbutton.setVisibility(View.VISIBLE);
        finButton.setVisibility(View.GONE);
        titleText.setEnabled(false);
        contentText.setEnabled(false);

        editbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EditMode = !EditMode;
                delbutton.setVisibility(View.GONE);
                editbutton.setVisibility(View.INVISIBLE);
                finButton.setVisibility(View.VISIBLE);
                titleText.setEnabled(true);
                contentText.setEnabled(true);
            }
        });

        finButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finButton.setVisibility(View.GONE);
                delbutton.setVisibility(View.VISIBLE);
                editbutton.setVisibility(View.VISIBLE);
                titleText.setEnabled(false);
                contentText.setEnabled(false);
            }
        });

    }
}