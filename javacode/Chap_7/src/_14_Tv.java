class Tv4{
	String brand;
	int year,  inch;
	Tv4(String brand, int year, int inch){  //생성자 함수
		this.brand=brand;
		this.year=year;
		this.inch=inch;
	}
	Tv4(){
		this.brand="oo";
		this.year=1900;
		this.inch=0;
		show();
	}
	void show(){
	
	System.out.println(brand+"에서 만든 "+ year+"년"+inch+"인치");
	}
}
public class _14_Tv {

	public static void main(String[] args) {
		
		   Tv4 myTV = new Tv4("LG", 2017, 32); //LG에서 만든 2017년 32인치
		   myTV.show();
		
	}
}