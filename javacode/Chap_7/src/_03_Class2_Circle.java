
class Circle {
	int radius;

	final double PI = 3.14; // 생략가능

	void setRadius(int r) {
		radius = r;
	}

	int getRadius() {
		return radius;
	}

	double getArea() {
		return radius * radius * Math.PI; // return radius*radius*PI;
	}
}

public class _03_Class2_Circle {
	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.setRadius(10);

		System.out.println(circle.getArea());

	}
}
