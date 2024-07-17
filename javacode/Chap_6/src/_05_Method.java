//함수

public class _05_Method {

	public static void sayHello() {
		System.out.println("say Hello");
	}

	public static void sayHello2() {
		for (int i = 0; i <= 5; i++)
			System.out.println("say Hello");
	}

	public static void printHello() {

		// System.out.println("Hello world");
		sayHello2();
	}

	public static void add(int num1, int num2) { // 괄호안에 있는 변수가 parameter
		int result;
		result = num1 + num2;
		System.out.println(result);
	}

	public static void main(String[] args) {
		add(5, 7);
		add(10, 78);
		add(-2, 78);

	}

}
