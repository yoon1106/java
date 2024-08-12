package java_;

public class Test_삼항연산자 {
	public static void main(String[] args) {
		int num = 5;
		if (num >= 5) {
			num = 10;
		} else {
			num = 20;
		}
		System.out.println(num);

		// 위 코딩을 삼항연산자로
		int result = (num >= 5) ? 10 : 20;
		System.out.println(result);

		int kor = 90;
		int eng = 100;
		int math = 70;
		int max;

		max = (kor <= eng) ? eng : kor;
		max = (max <= math) ? math : max;

		// max=(kor>eng)?(kor>math?kor:math):(b>c?b:c) 한줄로 나타내는 방법

		System.out.println(max);

	}
}