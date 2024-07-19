//
//class A{
//	int num; //인스턴스 변수;
//	int kor, eng, math;
//}

public class _01_ObjectTest {
	public static void main(String[] args) {
		A a; //변수 선언 int num; 하고 같다 A는 데이터타입 //참조형(reference type)선언시 클래스이름
		a= new A(); //객체(인스턴스) 생성
		
		System.out.println(a.num);
		a.num=3;
		System.out.println(a.num);
		
		System.out.println(a);
		
		a.kor=80;
		a.eng=80;
		a.math=90;
		
		System.out.println("국어"+a.kor);
		System.out.println("영어"+a.eng);
		System.out.println("수학"+a.math);
		
		
		
	}
}
