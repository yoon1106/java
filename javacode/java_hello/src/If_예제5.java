package java_;

public class If_예제5 {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 1;
		int num3 = 3;
		int max;

		if (num1 >= num2 && num1 >= num3) {
			max = num1;

		} else if (num2 >= num1 && num2 >= num3) {
			max = num2;

		} else {
			max = num3;

		}
		System.out.println("최댓값:" + max);
		
	}
}