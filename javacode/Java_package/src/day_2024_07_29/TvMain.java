package day_2024_07_29;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}
	
	//상속관련-자손에서는 언제든지 접근가능(패키지와 상관없이)
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	protected int getColor() {
		return color;
	}
	public void printProperty(){
		System.out.println(getSize()+"인치"+color+"컬러");
		//super.getSize()+"인치"+color+"컬러"이렇게 써도됨
		}
}
class IPTV extends ColorTV{
	private String add;
	public IPTV(String add,int size, int color) {
		super(size, color);
		this.add=add;
	}
	public void printProperty(){
		System.out.print(add+"주소에 "+getSize()+"인치, "+getColor()+"컬러 ");
	
		
	}
}
public class TvMain {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	      IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // 
	      iptv.printProperty();
	   
	}
}
