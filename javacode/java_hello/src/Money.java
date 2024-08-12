package java_;

public class Money {
	public static void main(String[] args) {
		//int money = 126500;
		int money50000 = 126500 / 50000;
		int money10000 = 26500 / 10000;
		int money5000 = 6500 / 5000;
		int money1000 = 1500 / 1000;
		int money500 = 500 / 500;
		int money100 = 0 / 100;

		
		System.out.println("오만원:" + money50000 + "장");
		System.out.println("만원:" + money10000 + "장");
		System.out.println("오천원:" + money5000 + "장");
		System.out.println("천원:" + money1000 + "장");
		System.out.println("오백원:" + money500 + "개");
		System.out.println("백원:" + money100 + "개");

	}

}
