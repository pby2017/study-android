package com.example.myrecyclerviewapp.model;

import android.support.annotation.DrawableRes;

public class MyIcon {
    @DrawableRes
    private int myIconResource;
    private String myIconDescription;
    private String createdTimeString;

    public MyIcon(int myIconResource, String myIconDescription, String createdTimeString) {
        this.myIconResource = myIconResource;
        this.myIconDescription = myIconDescription;
        this.createdTimeString = createdTimeString;
    }

    public int getMyIconResource() {
        return myIconResource;
    }

    public void setMyIconResource(int myIconResource) {
        this.myIconResource = myIconResource;
    }

    public String getMyIconDescription() {
        return myIconDescription;
    }

    public void setMyIconDescription(String myIconDescription) {
        this.myIconDescription = myIconDescription;
    }

    public String getCreatedTimeString() {
        return createdTimeString;
    }

    public void setCreatedTimeString(String createdTimeString) {
        this.createdTimeString = createdTimeString;
    }
}
