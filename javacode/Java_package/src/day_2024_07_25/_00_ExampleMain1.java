package day_2024_07_25;

//c 언어
//똑같은 함수이름을 쓸수있는 조건-파라미터(매개변수)타입 또는 갯수를 다르게함=함수 오버로딩
//함수 오버로딩= 같은 함수 이름으로 파라미터 타입또는 갯수를 달리하는 것
class OverloadingEx {
	public void function() {
		System.out.println("함수");
	}

	public void function(int num) {
		System.out.println(num);
	}

	public void function(double num) {
		System.out.println(num);
	}

	public void function(int num, int num2) {
		System.out.println(num);
	}

}

public class _00_ExampleMain1 {
	public static void main(String[] args) {
		OverloadingEx ex = new OverloadingEx();
		ex.function();
		ex.function(10);
	}
}
