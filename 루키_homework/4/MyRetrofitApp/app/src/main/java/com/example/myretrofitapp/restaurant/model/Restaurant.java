package com.example.myretrofitapp.restaurant.model;

import com.google.gson.annotations.SerializedName;

public class Restaurant {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("address")
    private String address;
    @SerializedName("is_open")
    private boolean isOpen;
    @SerializedName("created_at")
    private String createdAt;

    public Restaurant(String name, String address, boolean isOpen) {
        this.name = name;
        this.address = address;
        this.isOpen = isOpen;
    }

    public Restaurant(int id, String name, String address, boolean isOpen) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.isOpen = isOpen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, address: %s, is_open: %b, created_at: %s".toLowerCase(),
                id, name, address, isOpen, createdAt);
    }
}