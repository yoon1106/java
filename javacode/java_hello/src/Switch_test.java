package java_;

public class Switch_test {
	public static void main(String[] args) {

		int month = 4;

		switch (month) {
		case 3, 4, 5:
			System.out.println("봄입니다");

			break;
		case 6, 7, 8:
			System.out.println("여름입니다");

			break;
		case 9, 10, 11:
			System.out.println("가을입니다");

			break;

		case 12, 1, 2:
			System.out.println("겨울입니다");

			break;
		default:
			System.out.println("잘못된 입력 입니다");

		}
		//if문도 가능
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄입니다");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름 입니다");
		} else {
			System.out.println("잘못된 입력입니다.");
		}

	}
}