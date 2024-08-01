package day_2024_08_01;

interface ICalculater {
	int add(int num1, int num2);

	int sub(int num1, int num2);

	int mul(int num1, int num2);

	int div(int num1, int num2);
}

class MyCalculater implements ICalculater {

	@Override
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {

		return num1 - num2;
	}

	@Override
	public int mul(int num1, int num2) {

		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("잘못된 입력입니다");
			return 0;
		}
		return num1 / num2;
	}

}

public class InterfaceExampleMain {

	public static void main(String[] args) {
		ICalculater calculator = new MyCalculater();
		System.out.println(calculator.add(0, 0)); // 0
		System.out.println(calculator.sub(1, 1)); // 0

	}

}
