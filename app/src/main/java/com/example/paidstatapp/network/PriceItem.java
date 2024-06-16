package com.example.paidstatapp.network;

public class PriceItem {
    private String name;
    private String price;
    private String imageUrl;
    private String websiteUrl; // Add this field

    public PriceItem(String name, String price, String imageUrl, String websiteUrl) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.websiteUrl = websiteUrl; // Initialize this field
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
}
