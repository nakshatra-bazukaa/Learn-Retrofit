package com.github.bazukaa.nakshatra.retrofit;

import com.google.gson.annotations.SerializedName;


public class Post {

    //Get simple request
    private int userId;

    private Integer id;

    private String title;

    @SerializedName("body")
    private String text;

    public int getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    //To post a request
    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }
}
