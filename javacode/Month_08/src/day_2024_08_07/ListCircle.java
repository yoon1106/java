package day_2024_08_07;

import java.util.ArrayList;
import java.util.List;

class Circle {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

}

public class ListCircle {

	public static void main(String[] args) {
		List<Circle> circleList = new ArrayList<>();

		circleList.add(new Circle(10));
		circleList.add(new Circle(20));
		circleList.add(new Circle(30));

		double sum = 0;

		for (Circle circle : circleList) {
			sum =+circle.getArea();
		}
		System.out.println(sum);
	}

}
