package day_2024_07_24;

import java.util.Scanner;

public class _00_UpDown_정답 {
	public static void main(String[] args) {
		// 1~50사이의 랜덤숫자만들기

		int chance = 5;
		int answer = (int) (Math.random() * 50 + 1);// 1부터 50까지 숫자중 랜덤숫자 뽑기

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
			
			if(input > answer) {
				System.out.println("DOWN! 기회가"+chance--+"번 남았습니다");
			}else {
				System.out.println("UP! 기회가"+chance--+"번 남았습니다");
			}
			
			//기회가 끝나면 기회를 1개씩 줄인다.
			//chance --;
			
		}

	}
}
