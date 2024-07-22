class Song {
	String title, art, country;
	int year;

	Song(String title, String art, int year, String country) {
		this.title = title;
		this.art = art;
		this.country = country;
		this.year = year;
		
	}
	Song(){
		
	}
	void show() {
		System.out.println(year + "년 " + country + "국적의 " + art + "가 부른 " + title);
	}
}

public class _10_Song {

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();

	}
}