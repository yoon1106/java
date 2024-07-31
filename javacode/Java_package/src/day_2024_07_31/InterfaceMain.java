package day_2024_07_31;

//인터페이스에서
//데이터 멤버(상수와 함수선언(abstract))

interface Printable {
	public static final int COUNT=0; //인터페이스에서 변수 선언시 public static final 을 붙인다
	public  abstract void print(String doc);//인터페이스에서 함수는	public  abstract(함수본체가없는 함수선언했다는 뜻)
}

//interface=abstract=자식이 구현하라
class Printer implements Printable {

	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
}

public class InterfaceMain {
	public static void main(String args[]) {
		Printable prn=new Printer();
		prn.print("안녕하세요");
	}
}
