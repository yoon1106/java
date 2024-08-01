package day_2024_08_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println(7 / 2);
			// System.out.println(7 / 0); //원래 여기서 빨간줄뜸
			System.out.println("숫자를 넣으세요");
			int a = sc.nextInt();
                                                   // 0으로 나눌때               //숫자써야하는데 영어쓰는경우등
		} catch (Exception e) { // Exception e) //Arit hmeticException e//InputMismatchException e
			e.printStackTrace();
			System.out.println("에러입니다");
		} finally {
			System.out.println("굿바이");
		}

		System.out.println("종료입니다");

	}

}
