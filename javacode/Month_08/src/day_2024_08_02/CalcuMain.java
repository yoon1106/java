package day_2024_08_02;

import java.util.Scanner;

class Calculator {
	private int num1, num2;
	private String cal;
	private String answer;

	public void process() {
		while (true) {
			System.out.println("계산기");
			Scanner sc = new Scanner(System.in);

			System.out.print("수1: ");
			num1 = sc.nextInt();

			System.out.println();

			System.out.print("수2: ");
			num2 = sc.nextInt();

			System.out.println();

			System.out.print("연산: ");

			cal = sc.next();

			switch (cal) {
			case "+":
				System.out.print("계산결과:" + (num1 + num2));
				break;
			case "-":
				System.out.print("계산결과:" + (num1 - num2));
				break;
			case "*":
				System.out.print("계산결과:" + (num1 * num2));
				break;
			case "/":
				System.out.print("계산결과:" + (num1 / num2));
				break;
			default:
				System.out.print("다시 입력하세요");

			}
			System.out.print("계속 하시겠습니까? 계속 : Y , 종료 : N");
			answer = sc.next();

		}

	}
}

public class CalcuMain {

	public static void main(String[] args) {
		
	}

}
