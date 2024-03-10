package com.example.myapplication;

public class CategoryItem {
    private String imageUrl;
    private String title;

    public CategoryItem(String imageUrl, String title) {
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }
}
