package com.jth.exercise.test.vo;

public class TestBoardVO {
	private String title;
	private String content;
	private String writer;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "TestBoardVO [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
}
