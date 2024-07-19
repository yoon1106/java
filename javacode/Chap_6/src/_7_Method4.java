
public class _7_Method4 {
	public static double getCircleArea(double r) {
		double PI=3.14;
		double area= r*r*PI;
		return area;
	
		//return r*r*Math.PI;
	}
	
	public static double getRetangleArea(double width, double height) {
		double area= width*height;
		return area; //return width*height;
	}

	public static void main(String[] args) {
		
		System.out.println(getCircleArea(50));
		System.out.println(getRetangleArea(10,20));
		
	}

}
