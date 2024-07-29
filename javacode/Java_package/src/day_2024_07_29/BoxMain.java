package day_2024_07_29;

class Box {
	private int num;
	private String contents;

	public Box(int num, String contents) { // 생성자 만들기
		this.num = num;
		this.contents = contents;
	}

	public int getBoxNum() {
		return num;

	}

	public String toString() { // 이게 있어야 주소안나오고 원하는게 나옴 to string은 자동호출함수
		return contents;
	}

}

public class BoxMain {
	public static void main(String[] args) {
		Box[] ar = new Box[2];
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, "Computer");

		// 배열에서 번호가 202호인 box를 찾아 그내용물을 출력하는 반복문
		for (Box e : ar) {
			if (e.getBoxNum() == 202) {
				System.out.println(e);
			}
		}
	}
}
