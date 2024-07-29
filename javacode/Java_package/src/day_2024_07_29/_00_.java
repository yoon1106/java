package day_2024_07_29;

import java.util.Arrays;

public class _00_ {
	public static void main(String[] args) {

		int[] randomArr = new int[5];

		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = (int) (Math.random() * 100 + 1);
		}

		int min = randomArr[0];

		for (int i = 0; i < randomArr.length; i++) {

			if (min > randomArr[i])
				min = randomArr[i];
		}

		System.out.println(Arrays.toString(randomArr));
		System.out.println(min );

	}
}
