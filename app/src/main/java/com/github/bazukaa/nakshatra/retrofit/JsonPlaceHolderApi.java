package com.github.bazukaa.nakshatra.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

//Get simple request
public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();
}
