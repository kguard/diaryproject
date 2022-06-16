package com.example.app_note_01;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    private final TextView title;
    private final TextView contents;
    public CustomViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.textView2);
        contents = itemView.findViewById(R.id.textView3);
    }
    public void setTitle(String a){title.setText(a);}
    public void setContents(String a){contents.setText(a);}
}
