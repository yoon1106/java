package day_2024_07_24;
// static 이란 ? 정적변수=static 변수=공유변수=클래스변수
//1. 먼저 한번 메모리에 올려 공유
//2. static 함수에 instance(=함수,변수)가 올수없는 이유는? 
//스태틱함수 기본적으로 스택변수 컨트롤 하기위해 만듦
class InstCnt {
	static int instNum = 0; // 클래스 변수(static 변수)

	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성:" + instNum);

	}

}

public class _01_Static_1 {
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();

	}

}
