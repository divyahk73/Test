package com.example.Test.article;

public class Article {
	private Integer id;
	private String title;
	private String body;
	private String author;
	private String access_token;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(Integer id, String title, String body, String author, String access_token) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.author = author;
		this.access_token = access_token;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", body=" + body + ", author=" + author + ", access_token="
				+ access_token + "]";
	}
	
	
	
}
