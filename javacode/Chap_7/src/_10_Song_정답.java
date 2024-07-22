class Song2 {
	String title, artist, country;
	int year;

	Song2() {
	}

	Song2(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;

	}

	void show() {
		System.out.println(year + "년" + country + "국적의" + artist + "가 부른 " + title);
	}
}

public class _10_Song_정답 {

	public static void main(String[] args) {
		Song2 song = new Song2("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();

	}
}