package day_2024_08_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<String> a = new HashSet<>();
		
		a.add(new String("AAA"));
		a.add("AAA");
		
		System.out.println("사이즈 "+ a.size()); //출력 결과를 통해 동일 인스턴스가 저장되지 않음을 알 수 있다
		System.out.println(a);
		
		
		
		
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");

		set.add("Robbot");
		set.add("Box");

		System.out.println("인스턴스 수:" + set.size());

		for (Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();

		for (String s : set)
			System.out.print(s + '\t');
		System.out.println();
	}

}
