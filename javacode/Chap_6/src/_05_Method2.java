//함수

public class _05_Method2 {

	public static void printStar(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printStar(1);

	}

}
