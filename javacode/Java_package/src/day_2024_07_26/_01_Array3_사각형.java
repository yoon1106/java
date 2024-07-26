package day_2024_07_26;

import java.util.Scanner;

class Rectangle {
	private double height, width;

	Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	double getArea() {
		return height * width;
	}
}

public class _01_Array3_사각형 {
	public static void main(String[] args) {

		Rectangle[] arrRec = new Rectangle[3];
//		arrRec[0] = new Rectangle(10, 10);
//		arrRec[1] = new Rectangle(17, 89);
//		arrRec[2] = new Rectangle(90, 100);
		Scanner sc = new Scanner(System.in);
		
		double area = 0;
		
		for (int i = 0; i < arrRec.length; i++) {

			System.out.print("가로");
			int width = sc.nextInt();
			
			System.out.print("세로");
			int height = sc.nextInt();
			
			arrRec[i] = new Rectangle(width, height);
			
			area += arrRec[i].getArea();
		}
		System.out.println("총 사각형의 넓이의 합:" + area);

	}
}
