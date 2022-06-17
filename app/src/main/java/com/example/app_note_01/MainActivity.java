package com.example.app_note_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app_note_01.Database.Memo;
import com.example.app_note_01.Database.MemoDatabase;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        FloatingActionButton floatingActionButton=findViewById(R.id.floatingActionButton);


        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        List<Memo> list=new ArrayList<>();
        MemoDatabase database=MemoDatabase.getInstance(this);
        list= (List<Memo>) database.memoDAO().getAll();
        List<Memo> finalList = list;
        adapter = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View itemView = LayoutInflater.from(MainActivity.this).inflate(R.layout.itemholder, parent, false);
                RecyclerView.ViewHolder viewHolder = new CustomViewHolder(itemView);
                return viewHolder;
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                CustomViewHolder viewHolder = (CustomViewHolder) holder;
                com.example.app_note_01.Database.Memo memo= finalList.get(position);
                viewHolder.setTitle(memo.getTitle());
                viewHolder.title.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                        startActivity(intent);
                    }
                });
            }

            @Override
            public int getItemCount() {
                return finalList.size();
            }
        };

        recyclerView.setAdapter(adapter);




        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, WriteActivity.class);
                startActivity(intent);
            }
        });
    }
}