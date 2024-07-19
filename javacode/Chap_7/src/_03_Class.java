class A {
	int num; // 인스턴스 변수;
	int kor, eng, math;

	void setKor(int k1) {
		// this.kor=kor; //this.찍으면 int kor 위에꺼 뜻함
		kor = k1;

	}

	int getKor() {
		return kor;

	}

	void setEng(int e1) {
		// this.kor=kor; //this.찍으면 int kor 위에꺼 뜻함
		eng = e1;

	}

	int getEng() {
		return eng;

	}

	void setMath(int M1) {
		// this.kor=kor; //this.찍으면 int kor 위에꺼 뜻함
		math = M1;

	}

	int getMath() {
		return math;

	}

	void setNum(int n1) {
		// this.num=num;
		num = n1;
	}

	int getNum() {
		return num;
	}

	double getAvg() {
		return (kor + eng + math) / 3.0;
	}

}


public class _03_Class {
	public static void main(String[] args) {

	
		A a; // 변수 선언 int num; 하고 같다 A는 데이터타입 //참조형(reference type)선언시 클래스이름
		a = new A(); // 객체(인스턴스) 생성

		a.setKor(90);

		System.out.println(a.getKor());

		a.setEng(90);

		System.out.println(a.getEng());

		a.setMath(90);

		System.out.println(a.getMath());

		a.setNum(10);

		System.out.println(a.getNum());

		System.out.println(a.getAvg());

//		System.out.println(a.num);
//		a.num = 3;
//		System.out.println(a.num);
//
//		System.out.println(a);
//
//		a.kor = 80;
//		a.eng = 80;
//		a.math = 90;
//
//		System.out.println("국어" + a.kor);
//		System.out.println("영어" + a.eng);
//		System.out.println("수학" + a.math);

	}
}
