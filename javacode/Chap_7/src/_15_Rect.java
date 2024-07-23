class Rectangle3{
	int x, y, width, height;
	Rectangle3(int x,int y,int width,int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	void show() {
		System.out.println("("+x+","+y+")에서 크기가"+width+"x"+height+"인 사각형");//	void 만 리턴값이 없다
	}
	int square() {
		return width*height;
	}
	
}
public class _15_Rect {


		public static void main(String[] args) {
			Rectangle3 r = new Rectangle3(2, 2, 8, 7);
			Rectangle3 s = new Rectangle3(5, 5, 6, 6);
			Rectangle3 t = new Rectangle3(1, 1, 10, 10);

			r.show();
			System.out.println("s의 면적은 "+s.square());
		  
		
	}
}