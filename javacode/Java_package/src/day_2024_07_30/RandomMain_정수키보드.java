package day_2024_07_30;

import java.util.Arrays;
import java.util.Scanner;

public class RandomMain_정수키보드 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 배열의 갯수");

		int[] arrRandom = new int[sc.nextInt()];

		for (int i = 0; i < arrRandom.length; i++) {
			arrRandom[i] = (int) (Math.random() * 100 + 1);
			for (int j = 0; j < i; j++) {
				while (arrRandom[i] == arrRandom[j]) {
					arrRandom[i] = (int) (Math.random() * 100 + 1);
				}
			}

		}
		System.out.println(Arrays.toString(arrRandom));
	}

}
