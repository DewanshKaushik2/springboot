package com.springrest.springrest.entity;

public class Courses {
	private long idd;
	private String title;
	private String description;
	public Courses(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	// 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
	
	// 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
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		
		
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	
}
