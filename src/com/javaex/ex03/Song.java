package com.javaex.ex03;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	//생성자
	
	public Song() {}
	
	
	public Song(String title, String artist, String album,String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println(title+ "," +artist+"," +album+"," +composer+"," +year);
	}
	public Song(String title, String artist, String album,String composer, String year,int track ) {
		this(title,artist,album,composer,year);
		this.track = track;
		System.out.println(title+ "," +artist+"," +album+"," +composer+"," +year+"," +track);
	}
	
	
	//메소드 gs
	
	
	
	
	
	
	
	
	
	
	//메소드 일반
}



