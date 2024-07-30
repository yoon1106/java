package day_2024_07_30;
//함수오버라이팅= 상속관계에서 이름 같은함수가 있을때 자식함수로 부모함수 덮어쓰는 것
//오버라이딩은 자식꺼
//폴리몰피즘+오버라이딩=자바70%
class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
}

public class CakeMain {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		c1.yummy();
		c2.yummy();
	}

}
