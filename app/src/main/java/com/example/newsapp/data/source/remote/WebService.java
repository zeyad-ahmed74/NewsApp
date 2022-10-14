package com.example.newsapp.data.source.remote;

import com.example.newsapp.data.Model.PostResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WebService {

    @GET("posts")
    Call<PostResponse> getPosts();
}
