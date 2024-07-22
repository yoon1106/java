class Phone {
	String name;
	String num;

	Phone() {
		this.name = "없음";
		this.num = "없음";
		show();
	}

	Phone(String name, String num) {
		this.name = name;
		this.num = num;
	}

	void show() {
		System.out.println("이름:" + name);
		System.out.println("전화 번호:" + num);
	}

}

public class _13_Phone {

	public static void main(String[] args) {

		Phone phone = new Phone("홍길동", "010-0000-0000");
		phone.show();

		phone = new Phone("홍길순", "010-1111-1111");
		phone.show();

		phone = new Phone();

	}
}