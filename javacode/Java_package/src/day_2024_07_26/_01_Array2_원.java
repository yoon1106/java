package day_2024_07_26;
//반지름이 10, 15, 7인 원이 있다 
//3개원의 넓이 합을 구하는 프로그램을 완성하시오 단 배열활용하시오

class Circle3 {
	double radius;

	Circle3(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI; // return radius*radius*PI;
	}
	
}
public class _01_Array2_원 {
	public static void main(String[] args) {
		Circle3[] arrCircle = new Circle3[3];
		arrCircle[0] = new Circle3(10);
		arrCircle[1] = new Circle3(15);
		arrCircle[2] = new Circle3(7);

		
		int cnum=0;
		for(int i=0; i<arrCircle.length; i++) {
			cnum+=arrCircle[i].getArea();
			
		}
		System.out.println("총 원의 넓이의 합:"+ cnum);
	}
}
