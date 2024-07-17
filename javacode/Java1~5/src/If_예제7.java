

public class If_예제7 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 4;
		int num3 = 1;

		// int mid;

		if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2))
			System.out.println("중간값은 " + num1 + "입니다.");
		else if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1))
			System.out.println("중간값은 " + num2 + "입니다.");
		else
			System.out.println("중간값은 " + num3 + "입니다.");

	}
}