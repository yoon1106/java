package Hw_2024_08_07;

import java.util.HashSet;
import java.util.Set;


class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
	}

	@Override
	public int hashCode() { // 분류 알고리즘 작용
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		int age = ((Person) obj).age; // 상대방
		String name = ((Person) obj).name;// 상대방

		if (this.age == age && this.name.equals(name))
			return true;
		else
			return false;

	}
	@Override
	public String toString() {
		return name+"("+age+"세)";
	}
}


public class HashSetMain {

	public static void main(String[] args) {
		Set<Person> hSet = new HashSet<>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));
		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);

	}

}
