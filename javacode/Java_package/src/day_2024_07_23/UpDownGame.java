package day_2024_07_23;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {

		int randomInt = (int) ((Math.random() * 50) + 1);
		System.out.println("테스트용 랜덤숫자:" + randomInt);

		int chances = 5;
		Scanner scanner = new Scanner(System.in);

		System.out.println("1부터 50까지의 숫자 중 정답을 맞춰보세요!");

		while (chances > 0) {
			System.out.print("숫자를 입력하세요: ");
			int userNum = scanner.nextInt();

			if (userNum < 1 || userNum > 50) {
				System.out.println("1부터 50 사이의 숫자를 입력해주세요.");
				continue;
			}

			if (userNum < randomInt) {
				System.out.println("UP!");
			} else if (userNum > randomInt) {
				System.out.println("DOWN!");
			} else {
				System.out.println("축하합니다! 정답입니다.");
				break;
			}

			chances--;
			System.out.println("남은 기회: " + chances + "번");

			if (chances == 0) {
				System.out.println("모든 기회를 사용하셨습니다. 정답은 " + randomInt + "였습니다.");
			}
		}

		scanner.close();
		System.out.println("게임이 종료되었습니다.");
	}
}