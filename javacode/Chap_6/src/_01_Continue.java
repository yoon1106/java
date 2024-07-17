
public class _01_Continue {
	public static void main(String[] args) {
		// continue

		for (;;) {
			System.out.println("Hello world");
		}// for에 (;;)넣어주면 무한루프 돌아간다
		
		
		
		int num = 1;
		while (num <= 5) {
			// while 괄호안에 true 넣으면 무한반복

			if (num % 2 == 0)
				continue; // 반복문!의 처음으로 돌아가는것

			System.out.println("Hello world");
			num++;
		}

	}
}
