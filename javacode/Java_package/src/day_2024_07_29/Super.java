package day_2024_07_29;

class A {
	public A() {
		System.out.println("A 생성자");
	}
}

class B extends A {
	public B() {
		// super(); 생략되어있다
		System.out.println("B 생성자");
	}
}

public class Super {
	public static void main(String[] args) {
		new B();
	}
}
