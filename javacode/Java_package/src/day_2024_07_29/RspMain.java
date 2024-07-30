package day_2024_07_29;

import java.util.Scanner;

class Rsp {
	private String answer, computer;
	private int comint, anint;

	String str[] = { "가위", "바위", "보" };
	Scanner sc = new Scanner(System.in);

	public void run() {
		
		while (true) {
			comint = (int) (Math.random() * 3);
			System.out.println("컴퓨터와 가위바위보 게임을 합니다");
			System.out.print("가위바위보! >>");
			answer = sc.next();
			
			System.out.println("가위바위보! >>" + computer);
		}
	}
	
	
}

public class RspMain {
	public static void main(String[] args) {
		Rsp rsp = new Rsp();

	}
}
