
public class _03_구구단 {
	public static void main(String[] args) {
		// 짝수
		for (int i = 2; i < 10; i += 2) {

			System.out.println(i + "단을 출력합니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}
//짝수2번
		System.out.println("-------");
		for (int i = 2; i < 10; i ++) {
			if(i%2!=0)
				continue;
			System.out.println(i + "단을 출력합니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}
	}
}
