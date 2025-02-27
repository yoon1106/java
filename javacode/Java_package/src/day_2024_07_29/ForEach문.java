package day_2024_07_29;

public class ForEach문 {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		// 배열 요소 전체 출력
		for (int e : ar) {
			System.out.println(e + " ");
		}
		System.out.println(); //단순 줄 바꿈을 목적으로

		int sum = 0;
		// 배열 요소의 전체합 출력
		for (int e : ar) {
			sum += e;
		}
		System.out.println("sum: " + sum);
	}
}
