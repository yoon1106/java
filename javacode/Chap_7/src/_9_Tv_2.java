class TV{
	String name;
	int year,  num;
	TV(String name, int year, int num){  //생성자 함수
		this.name=name;
		this.year=year;
		this.num=num;
	}
	void show(){
	
	System.out.println(name+"에서 만든 "+ year+"년"+num+"인치");

	}

}
public class _9_Tv_2 {

	public static void main(String[] args) {
		
		   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		   myTV.show();
		   
		   TV myTV2 = new TV("00", 1900, 0); //00에서 만든 1900년 0인치
		   myTV2.show();
	}
}