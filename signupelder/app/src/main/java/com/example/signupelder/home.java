package com.example.signupelder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class home extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.idcategories);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> option_item = // Your data source
                adapter = new MyAdapter(option_item);

        recyclerView.setAdapter(adapter);
    }
}
