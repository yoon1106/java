package day_2024_07_29;

public class _2차원배열_문제 {
	public static void main(String[] args) {
		int[][] arrTwo = new int[4][4];

		for (int i = 0; i < arrTwo.length; i++) {

			for (int j = 0; j < arrTwo[i].length; j++) {

				arrTwo[i][j] = (int) ((Math.random() * 10) + 1);
				System.out.print(arrTwo[i][j] + "\t");

			}
			System.out.println();
		}

	}
}
