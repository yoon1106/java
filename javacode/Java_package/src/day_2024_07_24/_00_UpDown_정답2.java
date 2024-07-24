package day_2024_07_24;

import java.util.Scanner;

class UpAndDownGame {
	private final int CHANCE_COUNT = 5;
	private int chance;
	private int answer;

	public UpAndDownGame() {
		chance = CHANCE_COUNT;
		answer = (int) (Math.random() * 50 + 1);

	}

	public void run() {

		System.out.println("테스트용 랜덤숫자:" + answer);

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1부터 50 사이의 숫자를 입력해주세요.");
			System.out.print(">>>");

			// 사용자 입력받기
			int input = sc.nextInt();
			if (input == answer) {
				System.out.println("정답입니다");
				break;
			}
			if (chance == 1) {
				System.out.println("실패하였습니다. 정답은" + answer + "입니다.");
				break;
			}

			if (input > answer) {
				System.out.println("DOWN! 기회가" + chance-- + "번 남았습니다");
			} else {
				System.out.println("UP! 기회가" + chance-- + "번 남았습니다");
			}

			// 기회가 끝나면 기회를 1개씩 줄인다.
			// chance --;
		}
	}


}

public class _00_UpDown_정답2 {
	public static void main(String[] args) {
		 UpAndDownGame game =new  UpAndDownGame();
		 game.run();
	
	}

}
