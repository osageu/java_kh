package com.kh.chap01_list.part02_mvc.model.vo;

public class Music implements Comparable<Music> {
	
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
	
	@Override
	public int compareTo(Music o) {
		
		// M1.compareTo(M2) --> 양수 : M1, M2 자리 변경
		// M1.compareTo(M2) --> 음수 or 0 : M1, M2 자리 유지
		
		// 가수 오름 
		// this("하하하") > o("강보람") : 순서 변경 --> 양수 반환
		return this.artist.compareTo(o.artist);
		
	}
	
	
}
