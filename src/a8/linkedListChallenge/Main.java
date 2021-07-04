package a8.linkedListChallenge;

public class Main {

	public static void main(String[] args) {
		Song track1 = new Song("Track1", 178);
		Song track2 = new Song("Track2", 168);
		Song track3 = new Song("Track3", 128);
		Song track4 = new Song("Track4", 221);
		Song track5 = new Song("Track5", 245);
		Song track6 = new Song("Track6", 301);
		Song track7 = new Song("Track7", 194);
		Song track8 = new Song("Track8", 189);
		Song track9 = new Song("Track9", 164);
		
		Album album1 = new Album("Album 1");
		album1.add(track1);
		album1.add(track2);
		album1.add(track3);
		album1.add(track4);
		album1.add(track5);
		album1.add(track6);
		album1.add(track7);
		album1.add(track8);
		album1.add(track9);
		
		Album album2 = new Album("INSIDE");
		Song tracka1 = new Song("Comedy", 156);
		Song tracka2 = new Song("White Woman's Instagram", 146);
		Song tracka3 = new Song("Problematic", 111);
		Song tracka4 = new Song("All Eyes On Me", 189);
		album2.add(tracka1);
		album2.add(tracka2);
		album2.add(tracka3);
		album2.add(tracka4);
		
		Playlist playList1 = new Playlist("Favorites");
		playList1.add(track1);
		playList1.add(track2);
		playList1.add(track3);
		playList1.add(track4);
		playList1.add(track5);
		playList1.add(album2.getSongs().get(0));
		playList1.add(album2.getSongs().get(1));
		playList1.add(album2.getSongs().get(2));
		playList1.add(album2.getSongs().get(3));
		
		playList1.start();
		
	}

}
