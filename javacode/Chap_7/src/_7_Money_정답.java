class Money9{
	int money;

	void setMoney(int money) {
		this.money = money;
	}
	void show() {
		int m50000, m10000, m5000, m1000, m500, m100;

		int tMoney;

		m50000 = money / 50000;
		tMoney = money % 50000; // money-(m50000*50000)

		m10000 = money / 50000;
		tMoney = tMoney % 10000;

		m5000 = money/ 50000;
		tMoney = money % 5000;

		m1000 = money / 50000;
		tMoney = money % 1000;

		m500 = money / 50000;
		tMoney =money % 500;

		m100 = money / 50000;
		tMoney = money % 100;

		System.out.println(money);
		
		System.out.println("5만원: " + m50000 + "장");
		System.out.println("1만원: " + m10000 + "장");
		System.out.println("5천원: " + m5000 + "장");
		System.out.println("천원: " + m1000 + "장");
		System.out.println("5백원: " + m500 + "장");
		System.out.println("백원: " + m100 + "장");

	}

}

public class _7_Money_정답 {

	public static void main(String[] args) {
		Money9 money = new Money9();
		money.setMoney(1456000);
		money.show();

	
	}
}