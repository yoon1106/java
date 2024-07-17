
public class Break {

	public static void main(String[] args) {
		// 1부터 100까지의 숫자중 11의 배수이자 7의 배수인 첫번째 수는?
		for (int i = 1; i <= 1000; i++) {
			if (i % 7 == 0 && i % 11 == 0) {
				System.out.println(i);
			    break;
			}
		}
	}
}
