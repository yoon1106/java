package day_2024_07_26;

import java.util.Arrays;

public class _03 {
	public static void main(String[] args) {

		int[] intArr = new int[3];
		intArr[0] = 0;
		intArr[1] = 1;
		intArr[2] = 2;
		System.out.println(Arrays.toString(intArr));

		int[] intArr2 = { 0, 1, 2 };

		System.out.println(Arrays.toString(intArr2));

		String[] season = { "spring", "summer", "fall", "winter" };
		String[] season2 = { new String("spring"), "summer", "fall", "winter" };
		System.out.println(Arrays.toString(season));
		System.out.println(Arrays.toString(season2));

	}
}
