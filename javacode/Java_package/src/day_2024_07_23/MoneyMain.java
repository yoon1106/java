package day_2024_07_23;

import java.util.Scanner;

class Money {
	int money;

	void setMoney(int money) {
		this.money = money;
	}

	void show() {
		int money50000, money10000, money5000, money1000, money500, money100;
		int saveMoney = money;

		money50000 = saveMoney / 50000;
		saveMoney = saveMoney % 50000;

		money10000 = saveMoney / 10000;
		saveMoney = saveMoney % 10000;

		money5000 = saveMoney / 5000;
		saveMoney = saveMoney % 5000;

		money1000 = saveMoney / 1000;
		saveMoney = saveMoney % 1000;

		money500 = saveMoney / 500;
		saveMoney = saveMoney % 500;

		money100 = saveMoney / 100;
		saveMoney = saveMoney % 100;

		System.out.println(money);
		System.out.println("오만원:" + money50000 + "장");
		System.out.println("만원:" + money10000 + "장");
		System.out.println("오천원:" + money5000 + "장");
		System.out.println("천원:" + money1000 + "장");
		System.out.println("오백원:" + money500 + "개");
		System.out.println("백원:" + money100 + "개");

	}
}

public class MoneyMain {

	public static void main(String[] args) {
		Money money = new Money();
		Scanner sc = new Scanner(System.in);
		while (true) {
			   System.out.print("머니: ");
	            int amount = sc.nextInt(); 
	            money.setMoney(amount); 
	            money.show(); 

		

			System.out.println("계속 하시겠습니까? y, n");

			String yesOrNo = sc.next();

			if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
