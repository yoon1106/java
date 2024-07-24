package day_2024_07_24;

class NumberPrinter {
	private int myNum = 0;

	static void showInt(int n) {
		System.out.println(n);
	}

	static void showDouble(double n) {
		System.out.println(n);
	}

	void setMyNumber(int n) {
		myNum = n;

	}

	void showMyNumber() {
		showInt(myNum);
	}
}

//원래 함수는 객체 생성해서 객체명.함수()~~이런식으로함

public class _04_ClassMethod {
	public static void main(String[] args) {
		NumberPrinter.showInt(20);
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);

		np.setMyNumber(75);
		np.showMyNumber();

	}

}
