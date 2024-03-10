package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder> {

    private List<CategoryItem> categoryItemList;
    private Context context;

    public CategoriesAdapter(List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = this.categoryItemList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        CategoryItem categoryItem = categoryItemList.get(position);

        // Assuming CategoryItem has methods like getImageUrl() and getTitle()
        Picasso.get().load(categoryItem.getImageUrl()).into(holder.categoryImage);
        holder.categoryTitle.setText(categoryItem.getTitle());

        // You can set click listeners for category items here if needed
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    static class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView categoryImage;
        TextView categoryTitle;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryImage = itemView.findViewById(R.id.idCatogory);
            categoryTitle = itemView.findViewById(R.id.idCatogorie);
        }
    }
}
