class TV1{
	String brand;
	int year,  inch;
	TV1(String brand, int year, int inch){  //생성자 함수
		this.brand=brand;
		this.year=year;
		this.inch=inch;
	}
	TV1(){
		this.brand="oo";
		this.year=1900;
		this.inch=0;
		show();
	}
	void show(){
	
	System.out.println(brand+"에서 만든 "+ year+"년"+inch+"인치");
	}
}
public class _9_Tv정답 {

	public static void main(String[] args) {
		
		   TV1 myTV = new TV1("LG", 2017, 32); //LG에서 만든 2017년 32인치
		   myTV.show();
		   TV1 myTV2 = new TV1(); //00에서 만든 1900년 0인치
		;
	}
}