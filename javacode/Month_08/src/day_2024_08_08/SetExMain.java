package day_2024_08_08;

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
}

class Person2{
	private String name;

	Person2(String name){
		this.name=name;
	}
	@Override
	public int hashCode() { 
		return name.length();
		
		
	}
	@Override
	public boolean equals(Object obj) { 
		if(this.name.equals((((Person2)obj).name))) {
			return true;
		}else
			return false;
	}
}

public class SetExMain {

	public static void main(String[] args) {
		Set<Person> personSet = new HashSet<>();

		personSet.add(new Person("홍길동", 11));
		personSet.add(new Person("바둑이", 11));
		personSet.add(new Person("홍길동", 11));

		System.out.println(personSet.size());
		
		Set<Person2> personSet2 = new HashSet<>();

		personSet2.add(new Person2("홍길동"));
		personSet2.add(new Person2("바둑이"));
		personSet2.add(new Person2("홍길"));
		personSet2.add(new Person2("홍길순"));
		personSet2.add(new Person2("홍길동"));
		personSet2.add(new Person2("마틴"));
		System.out.println(personSet2.size());
	}

}
