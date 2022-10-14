package com.example.newsapp.data.Model;

import com.google.gson.annotations.SerializedName;

public class PostResponseItem{

	@SerializedName("id")
	private int postId;

	@SerializedName("title")
	private String postTitle;

	@SerializedName("body")
	private String postBody;

	@SerializedName("userId")
	private int userId;

	public int getId(){
		return postId;
	}

	public String getTitle(){
		return postTitle;
	}

	public String getBody(){
		return postBody;
	}

	public int getUserId(){
		return userId;
	}
}