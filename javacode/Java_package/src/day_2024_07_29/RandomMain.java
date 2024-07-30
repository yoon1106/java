package day_2024_07_29;

public class RandomMain {
	public static void main(String[] args) {
		int[][] arrRan = new int[4][3];

		for (int i = 0; i < arrRan.length; i++) {
			for (int j = 0; j < arrRan[i].length; j++) {
				arrRan[i][j] = (int) (Math.random() * 100 + 1);
				System.out.print(arrRan[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
