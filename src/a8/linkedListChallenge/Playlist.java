package a8.linkedListChallenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
	private String name;
	private LinkedList<Song> playList;
	private Scanner scanner;

	public Playlist(String name) {
		super();
		this.name = name;
		this.playList = new LinkedList<>();
	}

	// GETTERS

	public void add(Song song) {
		if (this.playList.contains(song)) {
			System.out.println("Song already exists in this playlist.");
		} else {
			this.playList.add(song);
		}
	}

	public String getName() {
		return name;
	}

	public LinkedList<Song> getPlayList() {
		return playList;
	}

	private void printMenu() {
		System.out.println("==============================");
		System.out.println("quit - to quit\r" + "replay - to replay current song\r" + "next - to play next song\r"
				+ "previous - to play previous song");
		System.out.println("==============================");
	}

	public void start() {
		scanner = new Scanner(System.in);
		printMenu();
		ListIterator<Song> listIterator = this.playList.listIterator();

		if (this.playList.isEmpty()) {
			System.out.println("This playlist is empty.");
			return;
		}
		
		boolean playing = true;
		boolean goingForward = true;
		System.out.println("Now playing: " + listIterator.next());
		
		while (playing) {
			String action = scanner.nextLine();
			if (action.equals("quit")) {
				playing = false;
			}
			if (action.equals("replay")) {
				if (listIterator.hasPrevious()) {
					if (goingForward) {
						System.out.println("Now replaying: " + listIterator.previous());
						goingForward = false;
					} else {
						System.out.println("Now replaying: " + listIterator.next());
						goingForward = true;
					}
				} else {
					System.out.println("We are at the start of the list.");
				}
			}
			if (action.equals("previous")) {
				if (listIterator.hasPrevious()) {
					if (goingForward) {
						listIterator.previous();
						goingForward = false;
					}
					System.out.println("Now playing: " + listIterator.previous());
				} else {
					System.out.println("Already at beginning of list.");
					goingForward = true;
				}
				
			}
			if (action.equals("next")){
				if (listIterator.hasNext()) {
					if (!goingForward) {
						listIterator.next();
						goingForward = true;
					}
					System.out.println("Now playing: " + listIterator.next());
				} else {
					System.out.println("Already at end of list.");
					goingForward = false;
				}
			}
		}
		System.out.println("Stopping playback. Quitting.");
	}

}
