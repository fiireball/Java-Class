package a8.linkedListChallenge;

import java.util.ArrayList;

public class Album {

	private ArrayList<Song> songs;
	private String name;

	public Album(String name) {
		super();
		this.name = name;
		this.songs = new ArrayList<>();
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

	public String getName() {
		return name;
	}
	
	public void add(Song song) {
		this.songs.add(song);
	}

}
