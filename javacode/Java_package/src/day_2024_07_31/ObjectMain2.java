package day_2024_07_31;

class Circle extends Object {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "넓이는 " + getArea() + " 입니다";
	}
}

public class ObjectMain2 {
	public static void main(String args[]) {
		Object obj = new Circle(10);

		System.out.println(obj);
	}
}
