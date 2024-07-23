package day_2024_07_23;

import day_2024_07_24.A;

// private=  클래스내에서만 쓸 수 있음
// public= 언제 어디서든 접근가능
// default= 같은 패키지내에서는 언제든지 접근가능하지만 다른 패키지에서는 접근불가
// protected= 패키지와 상관없이 상속했을때 자식까지
class Rectangle {
    private int x, y, width, height;
    public int x2, y2;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.x2 = x + width;
		this.y2 = y + height;

	}

	void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가" + width + "x" + height + "인 사각형");
	}

	int square() {
		return width * height;
	}

	// t.contains(r) 여기서 t 는 this
	boolean contains(Rectangle rec) {
		boolean isContain = false;

		if ((this.x < rec.x) && (this.x2 > rec.x2) && (this.y2 > rec.y2))
			isContain = true;
		else
			isContain = false;

		return isContain;
	}
}

// access modifier : 접근제한자 
public class RectangleMain {
	public static void main(String[] args) {
		A a=newA(); //access 연습차원에서 넣음 
	
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

	
		
		r.show();
		
		r.show();
		System.out.println("s의 면적은 " + s.square());

		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s를 포함합니다.");

	}

	private static A newA() {
		// TODO Auto-generated method stub
		return null;
	}
}

//
//출력
//(2,2)에서 크기가 8x7인 사각형
//s의 면적은 36
//t는 r을 포함합니다.
