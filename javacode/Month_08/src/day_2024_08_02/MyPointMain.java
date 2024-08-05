package day_2024_08_02;

class MyPoint extends Object {
	int num1, num2;

	MyPoint(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.num1 == ((MyPoint) obj).num1 && this.num2 == ((MyPoint) obj).num2) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Point(" + num1 + "," + num2 + ")";
	}
}

public class MyPointMain {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);

		System.out.println(p);

		if (p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");

	}

}
