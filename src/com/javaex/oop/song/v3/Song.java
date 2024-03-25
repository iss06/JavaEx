package com.javaex.oop.song.v3;

//v3 . this 생성자
public class Song {


	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song(String title, String artist) {
		this.title = title;
		this. artist = artist;
		System.out.println("title, artist");
	}

	public Song(String title, String artist,String album,String composer,int year,int track) {
		this.title = title;
		this.artist = artist;
		
	}
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

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String setComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void showInfo() {
		System.out.printf(artist + "," + title + "(" + album + ", " + year + ", " + track + "번, " + composer + " 작곡"
				+ ")" + "\n");

	}
}
