//피라미드*그리기
public class _06_피라미드함수 {
	public static void starPrint5(int num) {
		for (int i = 1; i <= num; i++) { // 아파트 층수

			for (int j = i; j < num; j++) { // 방갯수
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) { // 방갯수
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		starPrint5(1);
		starPrint5(6);

	}
}
