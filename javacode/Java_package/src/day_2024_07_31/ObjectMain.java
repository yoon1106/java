package day_2024_07_31;

//@Override
class AA extends Object {
	public void aaa() {
		System.out.println("aaa 호출");
	}

	@Override
	public String toString() {
		return "주소나오지마";
	}
}

public class ObjectMain {
	public static void main(String args[]) {
		AA a = new AA();

		System.out.println(a);

		String str = "111";
		System.out.println(str);
	}
}
