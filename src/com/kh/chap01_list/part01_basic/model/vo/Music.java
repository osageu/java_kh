package com.kh.chap01_list.part01_basic.model.vo;

public class Music {
	
	// field
	private String title; 	// 노래 제목
	private String artist; 	// 가수명
	
	// constructor
	public Music() {
		
	}
	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	// method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
	
}
