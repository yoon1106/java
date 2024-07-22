class Rectangle4 {
	double width, height;

	 Rectangle4(double width, double height) {
		this.width = width;
		this.height =height;
	}

	void getArea() {
		System.out.println(width*height);

	}
}

public class _12_Rectangle_ {
	public static void main(String[] args) {

		Rectangle4 rec = new Rectangle4(10,10);
		rec.getArea();

	}
}