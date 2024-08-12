package java_;

public class MoneyAnswer2 {
	public static void main(String[] args) {
		int money = 126500;
		int m50000, m10000, m5000, m1000, m500, m100;

		int tMoney;

		m50000 = 126500 / 50000;
		tMoney = 126500 % 50000; // money-(m50000*50000)

		m10000 = tMoney / 50000;
		tMoney = tMoney % 50000;

		m5000 = tMoney / 50000;
		tMoney = tMoney % 5000;

		m1000 = tMoney / 50000;
		tMoney = tMoney % 1000;

		m500 = tMoney / 50000;
		tMoney = tMoney % 500;

		m100 = tMoney / 50000;
		tMoney = tMoney % 100;

		System.out.println("5만원: " + m50000 + "장");
		System.out.println("1만원: " + m10000 + "장");
		System.out.println("5천원: " + m5000 + "장");
		System.out.println("천원: " + m1000 + "장");
		System.out.println("5백원: " + m500 + "장");
		System.out.println("백원: " + m100 + "장");

	}

}
