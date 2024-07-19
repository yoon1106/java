

public class If_예제6 {
	public static void main(String[] args) {
		int num1 = 90;
		int num2 = 70;
		int num3 = 100;

		int max;

		if ((num1 >= num2) && num1 >= num3) {
			max = num1;
		} else if ((num2 >= num1) && num2 >= num3) {
			max = num2;
		} else {
			max = num3;
		}

		System.out.println(max);
		///////////////////////////////////////////////////
		// 두번째 방법
		max = num1;

		if (max <= num2) {
			max = num2;
		}

		if (max <= num3) {
			max = num3;
		}

		System.out.println(max);

		///////////////////////////////////////////////////
		// 세번째 방법
		if (num1 >= num2) {
			if (num1 >= num3) {
				max = num1;
			}
		} else if (num2 >= num1) {
			if (num2 >= num3) {
				max = num2;
			}
		} else {
			max = num3;
		}

		System.out.println(max);

	}
}