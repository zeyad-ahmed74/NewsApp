package com.example.newsapp.data.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PostResponse{

	@SerializedName("PostResponse")
	private List<PostResponseItem> postResponse;

	public List<PostResponseItem> getPostResponse(){
		return postResponse;
	}
}