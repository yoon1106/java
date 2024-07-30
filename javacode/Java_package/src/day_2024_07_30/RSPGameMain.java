package day_2024_07_30;

import java.util.Scanner;

//1.배열을 활용

class RspPlayer {
	public static final String[] arrRSP = { "가위", "바위", "보" }; // 배열이므로 0:가위 1:바위 2:보
	private String name;
	private String rsp;

	// 컴퓨터
	public RspPlayer(String name) {
		this.name = name;
		int num = (int) (Math.random() * 3);
		rsp = arrRSP[num];
	}

	// 사용자
	public RspPlayer(String name, String rsp) {
		this.name = name;
		this.rsp = rsp;
	}

	public void getResult(RspPlayer you) {
		System.out.println(this.name + ":" + this.rsp + " " + you.name + ":" + you.rsp);

		if (this.rsp.equals(you.rsp)) {
			System.out.println("비겼습니다.");
			return;
		}

		if (this.rsp.equals("가위")) {
			if (you.rsp.equals("보")) {
				System.out.println(this.name + "이겼습니다.");
			} else if (you.rsp.equals("바위")) {
				System.out.println(this.name + " 졌습니다.");
			}
		} else if (this.rsp.equals("바위")) {

			switch (you.rsp) {
			case "보":
				System.out.println(this.name + "졌습니다.");
				break;
			case "가위":
				System.out.println(this.name + "이겼습니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		} else if (this.rsp.equals("보")) {
			if (you.rsp.equals("바위")) {
				System.out.println(this.name + "이겼습니다.");
			} else if (you.rsp.equals("가위")) {
				System.out.println(this.name + " 졌습니다.");
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}

public class RSPGameMain {
	public static void main(String[] args) {

		System.out.println("컴퓨터와 가위바위보 게임을 합니다");

		while (true) {

			RspPlayer computer = new RspPlayer("컴퓨터");
			RspPlayer you; // =new RspPlayer("컴퓨터");

			Scanner sc = new Scanner(System.in);
			System.out.print("가위바위보!>>");
			String rsp = sc.next();
			you = new RspPlayer("당신", rsp);

			// 결과
			computer.getResult(you);

			System.out.print("그만하시겠습니까? 그만 or no");
			rsp = sc.next();

			if (rsp.equals("그만")) {
				break;
			}
			System.out.println("게임 종료입니다.");
		}

	}
}
