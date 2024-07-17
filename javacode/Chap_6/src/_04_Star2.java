
public class _04_Star2 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------------------");
		for (int i = 1; i <= 5; i++) { // 세로 칸수 결정

			for (int j = 1; j < i; j++) { // 가로 칸수 결정

				System.out.print(" ");

			}

			for (int j = i; j <= 5; j++) { // 가로 칸수 결정

				System.out.print("*");

			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		for (int i = 1; i <= 5; i++) { // 세로 칸수 결정

			for (int j = i; j < 5; j++) { // 가로 칸수 결정

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) { // 가로 칸수 결정

				System.out.print("*");

			}
			System.out.println();
		}
		
	}
}
