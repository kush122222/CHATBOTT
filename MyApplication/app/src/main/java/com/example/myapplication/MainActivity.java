package com.example.myapplication;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assuming you have a RecyclerView in your activity_main.xml with ID "categories"
        RecyclerView categoriesRecyclerView = findViewById(R.id.idcategories);

        // Create an example list of categories (replace this with your actual data)
        List<CategoryItem> categoryItemList = new ArrayList<>();
        // Add your CategoryItem objects to the list

        // Create an instance of your custom adapter for the categories
        CategoriesAdapter categoriesAdapter = new CategoriesAdapter(categoryItemList);

        // Set the adapter for the RecyclerView
        categoriesRecyclerView.setAdapter(categoriesAdapter);

        // Set the layout manager for the RecyclerView
        categoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Similar setup for other RecyclerViews

        // Example: Assuming you have a RecyclerView in your option_item.xml with ID "idGridLayout"
        RecyclerView optionsRecyclerView = findViewById(R.id.idbutton);

        // Create an example list of options (replace this with your actual data)
        List<OptionItem> optionItemList = new ArrayList<>();
        // Add your OptionItem objects to the list

        // Create an instance of your custom adapter for the options
        OptionsAdapter optionsAdapter = new OptionsAdapter(optionItemList);

        // Set the adapter for the RecyclerView
        optionsRecyclerView.setAdapter(optionsAdapter);

        // Set the layout manager for the RecyclerView
        optionsRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));
    }
}
