package day_2024_07_26;

import java.util.Arrays;

public class _5_Random {
	public static void main(String[] args) {

		int[] randomArr = new int[5];

		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = (int) (Math.random() * 100 + 1);
		}

		int max = randomArr[0];

		for (int i = 0; i < randomArr.length; i++) {

			if (max < randomArr[i])
				max = randomArr[i];
		}

		System.out.println(Arrays.toString(randomArr));
		System.out.println(max);

	}
}
