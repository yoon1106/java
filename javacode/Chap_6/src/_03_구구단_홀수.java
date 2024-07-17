
public class _03_구구단_홀수 {
	//결과물이 홀수인것만 나오기
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {

			for (int j = 1; j < 10; j++) {
				if ((i * j) % 2 == 1) {
					System.out.println(i + "x" + j + "=" + i * j);
				}

			}
			System.out.println();
		}
	}
}
