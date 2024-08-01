package day_2024_08_01;

abstract class House{
	public void method() {
		System.out.println("추상 클래스");
	}
	
	public abstract void method2();
	
}

class Building extends House{

	@Override
	public void method2() {
		System.out.println("추상 메소드 구현");
		
	}
	
}



public class AbstractClassMain {
	public static void main(String[] args) {
		House house= new Building();
	//	Building house2 = new Building(); 위에 코딩이랑 같음

		
	}
	

}
