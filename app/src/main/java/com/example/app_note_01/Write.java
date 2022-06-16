package com.example.app_note_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Write extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write);
        EditText editText=findViewById(R.id.edittext1);
        EditText editText1=findViewById(R.id.edittext2);
        Button button=findViewById(R.id.button);
        Button button1=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Write.this,MainActivity.class);
                intent.putExtra("Title",editText.getText().toString());
                intent.putExtra("contents",editText1.getText().toString());

            }
}