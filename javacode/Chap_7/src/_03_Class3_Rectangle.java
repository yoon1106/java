
class Rectangle {
	double height, width;

	void setHeight(double h) {
		height = h;

	}

	void setWidth(double w) {
		width = w;

	}

	double getArea() {

		return height * width;

	}

	void printArea(Rectangle rec) {

		System.out.println("넓이" + rec.getArea());
	}
}



public class _03_Class3_Rectangle {
	public static void main(String[] args) {


		Rectangle rec = new Rectangle();
		rec.setHeight(10.1);
		rec.setWidth(10.1);

		System.out.println(rec.getArea());

		rec.printArea(rec);

	

	}
}
