package com.test.connect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Article {
	@Column(name = "ARTICLE_ID")
	@Id
	private int id;
	
	@Column(name = "ARTICLE_TITLE")
	private String title;
	
	@Column(name = "ARTICLE_DATE")
	private String date;
	
	@Column(name = "AUTHOR_NAME")
	private String author;
	
	@Column(name = "ARTICLE_CONTENT")
	private String content;
	
	@Column(name = "ARTICLE_IMG")
	private String image;
	
	@Column(name = "ARTICLE_VIEWS")
	private int views;
	
	@Column(name = "ARTICLE_COMMENTS")
	private int comments;
	
	@Column(name = "AUTHOR_IMG")
	private String authorImg;
	

	public Article(int id, String title, String date, String author, String content, String image, int views,
			int comments, String authorImg) {

		this.id = id;
		this.title = title;
		this.date = date;
		this.author = author;
		this.content = content;
		this.image = image;
		this.views = views;
		this.comments = comments;
		this.authorImg = authorImg;
	}
	
	public Article() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		
		this.comments = comments;
	}

	public String getAuthorImg() {
		return authorImg;
	}

	public void setAuthorImg(String authorImg) {
		this.authorImg = authorImg;
	}
	
	
	
	
	
	
}
