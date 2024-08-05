package day_2024_08_02;

import java.util.Scanner;

public class RotationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");

		String answer = sc.nextLine();
		for (int i = 0; i < answer.length(); i++) {
			System.out.print(answer.substring(i));
			System.out.println(answer.substring(0, i));

		}

	}

}
