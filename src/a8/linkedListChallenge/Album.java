package a8.linkedListChallenge;

import java.util.ArrayList;

public class Album {

	private String name;
	private ArrayList<Song> songs;

	public Album(String name) {
		super();
		this.name = name;
		this.songs = new ArrayList<>();
	}

	public void add(Song song) {
		this.songs.add(song);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}
	
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

}
