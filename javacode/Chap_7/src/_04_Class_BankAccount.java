class BankAccount {
	int balance = 0; // 예금 잔액

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	// 예금 출금
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	// 예금조회
	public int checkMyBalacne() {
		System.out.println("잔액 : " + balance);
		return balance;
	}

	// 파라미터로 객체 받아오기//변수선언
	public void checkBalance(BankAccount acc) {
		acc.checkMyBalacne();
	}

}

public class _04_Class_BankAccount {
	public static void main(String[] args) {

		// 두개의 인스턴스 생성
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();

		// 각 인스턴스를 대상으로 예금을 진행
		yoon.deposit(5000);
		park.deposit(3000);

		// 각 인스턴스를 대상으로 잔액을 조회
		yoon.checkMyBalacne();
		park.checkMyBalacne();

		park.checkBalance(yoon); // BankAccount acc = yoon

		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;

		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyBalacne();
		ref2.checkMyBalacne();

	}
}
