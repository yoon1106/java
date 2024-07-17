
public class Test_반복문2 {
	public static void main(String[] args) {
		int dan = 3;
		for (int i = 1; i <= 9; i++) {

			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		// 출력이 홀수 13579...99

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				System.out.println(i);
		}

		for (int i = 1; i <= 100; i = i + 2) {

			System.out.println(i);
		}
	}
}
