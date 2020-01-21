package com.github.bazukaa.nakshatra.retrofit;

import com.google.gson.annotations.SerializedName;

//Get simple request
public class Post {
    private int uid;

    private int id;

    private String title;

    @SerializedName("body")
    private String text;

    public int getUid() {
        return uid;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
