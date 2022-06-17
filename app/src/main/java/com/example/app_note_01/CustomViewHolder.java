package com.example.app_note_01;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public final TextView title;
    public CustomViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.textView2);
    }
    public void setTitle(String a){title.setText(a);}
}
