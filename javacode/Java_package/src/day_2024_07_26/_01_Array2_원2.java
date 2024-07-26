package day_2024_07_26;

import java.util.Scanner;

class Circle11 {
	double radius;

	Circle11(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI; // return radius*radius*PI;
	}

}

public class _01_Array2_원2 {
	public static void main(String[] args) {
		Circle11[] arrCircle = new Circle11[3];
		
		double area=0;
		
		for (int i = 0; i < arrCircle.length; i++) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println(i + "번째의" + "반지름을 입력하시오");
			
			arrCircle[i] = new Circle11(sc.nextInt());
			area += arrCircle[i].getArea();

		}
		System.out.println("총 원의 넓이의 합:" + area);
	}
}
