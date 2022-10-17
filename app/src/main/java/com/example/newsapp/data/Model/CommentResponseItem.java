package com.example.newsapp.data.Model;

import com.google.gson.annotations.SerializedName;

public class CommentResponseItem{

	@SerializedName("name")
	private String name;

	@SerializedName("postId")
	private int postId;

	@SerializedName("id")
	private int id;

	@SerializedName("body")
	private String body;

	@SerializedName("email")
	private String email;

	public String getName(){
		return name;
	}

	public int getPostId(){
		return postId;
	}

	public int getId(){
		return id;
	}

	public String getBody(){
		return body;
	}

	public String getEmail(){
		return email;
	}
}