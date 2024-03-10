package com.example.myapplication;

public class OptionItem {
    private String imageUrl;
    private String title;

    public OptionItem(String imageUrl, String title) {
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
