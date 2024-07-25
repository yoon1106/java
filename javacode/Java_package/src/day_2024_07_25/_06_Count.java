package day_2024_07_25;

import java.util.Scanner;

public class _06_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int aeiou = 0;
		int bcd = 0;
		int empty = 0;
		char in;
		System.out.print("입력하시오");
		input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			in = input.charAt(i);
			switch (in) {
			case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
				aeiou++;
			case ' ':
				empty++;
			default:
				bcd++;
			}
		}
		System.out.println("총 글자 수는"+input+"개 입니다");
		System.out.println("모음은"+ aeiou+"개 입니다");
		System.out.println("자음은"+ bcd+"개 입니다");
	}
}
