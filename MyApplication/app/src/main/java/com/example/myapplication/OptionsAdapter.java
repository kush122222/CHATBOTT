package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class OptionsAdapter extends RecyclerView.Adapter<OptionsAdapter.OptionViewHolder> {

    private List<OptionItem> optionItemList;

    // Corrected constructor
    public OptionsAdapter(List<OptionItem> optionItemList) {
        this.optionItemList = optionItemList;
    }

    @NonNull
    @Override
    public OptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.option_item, parent, false);
        return new OptionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OptionViewHolder holder, int position) {
        OptionItem optionItem = optionItemList.get(position);

        Picasso.get().load(optionItem.getImageUrl()).into(holder.optionImage);
        holder.optionHeading.setText(optionItem.getTitle());

        holder.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Button 1 Clicked: " + optionItem.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Button 2 Clicked: " + optionItem.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Button 3 Clicked: " + optionItem.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Button 4 Clicked: " + optionItem.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return optionItemList != null ? optionItemList.size() : 0;
    }

    static class OptionViewHolder extends RecyclerView.ViewHolder {
        ImageView optionImage;
        TextView optionHeading;
        Button button1, button2, button3, button4;

        public OptionViewHolder(@NonNull View itemView) {
            super(itemView);
            optionImage = itemView.findViewById(R.id.idoption);
            optionHeading = itemView.findViewById(R.id.idheading);
            button1 = itemView.findViewById(R.id.button1);
            button2 = itemView.findViewById(R.id.button2);
            button3 = itemView.findViewById(R.id.button3);
            button4 = itemView.findViewById(R.id.button4);
        }
    }
}
