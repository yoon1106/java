class Circle3 {
	double radius;

	Circle3(double radius) {
		this.radius = radius;
	}

	void getArea() {
		System.out.println(radius * radius * Math.PI);

	}
}

public class _11_Circle3 {
	public static void main(String[] args) {

		Circle3 c3 = new Circle3(10);
		c3.getArea();

	}
}