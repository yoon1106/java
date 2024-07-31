package day_2024_07_31;

class A {
	public void aaa() {
		System.out.println("aaa 호출");
	}
}

class B extends A {
	public void bbb() {
		System.out.println("bbb 호출");
	}
}

class C extends B {
	public void ccc() {
		System.out.println("ccc 호출");
	}
}

public class ObjCastingMain {
	public static void main(String args[]) {

		A a = new B(); // 다형성

		if (a instanceof B) { // a주소 찾아가서 B가 있으면 안에 내용 호출된다
			B b = (B) a; // 자식=(자식)부모
			b.bbb();
			
			((B)a).bbb();//위에 두줄 요약
		
		}
		a = new C();// 다형성
		if (a instanceof B) {
			System.out.println("true입니다");
		}
	}
}
