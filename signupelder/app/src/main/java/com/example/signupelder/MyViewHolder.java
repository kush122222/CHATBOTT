package com.example.signupelder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;

    public MyViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.idCatogorie);
    }
}
