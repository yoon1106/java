class BankAccount {
	String accNumber; // 참조형 String accNumber=null;써도되지만 클래스안에 인스턴스 변수는 디폴트가 null 이므로 안써도 괜찮다
	String ssNumber;
	int balance = 0; // 예금 잔액

	BankAccount() {
	}

	// 생성자 함수 만들기 =클래스 이름과 똑같은 함수
	BankAccount(String accNumber, String ssNumber, int balance) {
		this();
		
		this.accNumber = accNumber;
		this.ssNumber = ssNumber;
		this.balance = balance;
	}

	void initBankAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}

	void thisExample() {
		deposit(1000);//사실은 this.deposit(1000);인데 생략가능
		withdraw(1000);
	}

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
		if (acc != null) {
			acc.checkMyBalacne();
		}

	}

}

//this 에 관하여
//this 함수, this 로 멤버함수 또는 변수접근

public class _04_Class_BankAccount {
	public static void main(String[] args) {

		BankAccount noh = new BankAccount(); // 누군가가 만들었기때문에 안만들어도 돌아감
		// 디폴트 생성자를 언제 컴파일러가 안만들어주는가?->개발자가 생성자를 한개라도 만들었을때
		// 컴파일러는 디폴트 생성자를 안넣어줌, 따라서 위에 bankAccount(){}만들어주면 오류안난다

		BankAccount choi = new BankAccount("12-34-56", "801002", 0); // 생성자함수 호출
//		choi.initBankAccount("12-34-56", "801002", 0); //초기화 함수
//		
//		
//		
//		
//		// 두개의 인스턴스 생성
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
//
//		// 각 인스턴스를 대상으로 예금을 진행
//		yoon.deposit(5000);
//		park.deposit(3000);
//
//		// 각 인스턴스를 대상으로 잔액을 조회
//		yoon.checkMyBalacne();
//		park.checkMyBalacne();
//
//		park.checkBalance(yoon); // BankAccount acc = yoon
//
//		BankAccount ref1 = new BankAccount();
//		BankAccount ref2 = ref1;
//
//		ref1.deposit(3000);
//		ref2.deposit(2000);
//		ref1.withdraw(400);
//		ref2.withdraw(300);
//		ref1.checkMyBalacne();
//		ref2.checkMyBalacne();

	}
}
