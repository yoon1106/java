package day_2024_07_24;

class AccessWay {
	static int num = 0;

	AccessWay() {
		incrCnt();
	}

	void incrCnt() {
		num++; // 클래스 내부에서 이름을 통한 접근
	}
}



public class _02_Static_2 {
	public static void main(String[] args) {

		AccessWay way = new AccessWay();   //1
		way.num++; // 외부에서 인스턴스의 이름을 통한 접근 //2
		AccessWay.num++; // 외부에서 클래스의 이름을 통한 접근 //3
		System.out.println("num=" + AccessWay.num); //따라서 답 3
	}

}
