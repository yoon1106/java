
//default package란?
//패키지 선언이 안되어 있으면 디폴트 패키지임

import com.wxfs.smart.Circle;


public class CircleMAin {
	public static void main(String[] args) {
		Circle circle=new Circle(10);
		System.out.println(circle.getArea());
		
		com.fxms.simple.Circle circleb=new com.fxms.simple.Circle(10); //패키지 중복은 안되기때문에 링크 수기로적어줘
		System.out.println(circleb.getPara());
	
	
	}
}
