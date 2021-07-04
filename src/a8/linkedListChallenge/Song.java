package a8.linkedListChallenge;

public class Song {
	private int duration;
	private String title;

	public Song(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public String getDurationFormatted() {
		String str = "";
		if (duration/60 < 10) {
			str = "0";
		}
		if (duration%60 < 10) {
			str += (duration/60) + ":0" + (duration%60);
		} else {
			str += (duration/60) + ":" + (duration%60);
		}

		return str;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return this.title + " [" + this.getDurationFormatted() + "]";
	}
	
	
}
