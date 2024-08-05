package day_2024_08_02;

class Person extends Object {
	String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((Person) obj).name) {
			return true;
		} else {
			return false;
		}
	}
}

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최명태")));
	}

}
