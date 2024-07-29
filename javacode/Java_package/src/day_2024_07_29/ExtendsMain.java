package day_2024_07_29;

class AAA {
	int aaa;

	public void aaaFunction() {
		System.out.println("aaaFunction 함수호출");
	}
}

//상속 부모변수와 부모메소드를 받는다
class BBB extends AAA {
	int bbb;
}

public class ExtendsMain {
	public static void main(String[] args) {
		AAA aaa = new AAA(); 

		System.out.println(aaa.aaa);
		aaa.aaaFunction();

		BBB bbb = new BBB();
		System.out.println(bbb.aaa);
		bbb.aaaFunction();

		System.out.println(bbb.bbb);
	}
}
