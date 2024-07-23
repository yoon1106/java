package day_2024_07_23;

import java.util.Scanner;

class Rect10{
	private double w;
	private double h;

	public Rect10(double w, double h) {
		this.w = w;
		this.h = h;
	}

	public double getArea() {
		return w * h ;
	}
}

public class Rect_InputMain_무한루프 {

	public static void main(String[] args) {

		while (true) {
			double w,h;
			Scanner sc = new Scanner(System.in);

			System.out.print("가로:");
			w= sc.nextDouble();
			
			System.out.print("세로:");
			h = sc.nextDouble();
			
			Rect10 rect = new Rect10(w,h);
			System.out.println("사각형 넓이는" + rect.getArea());
			System.out.println("계속 하시겠습니까? y, n");

			String yesOrNo = sc.next();

			if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
