package day_2024_08_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class IntLinkedList{
	int num;
	IntLinkedList link;
	public IntLinkedList(int num) {
		this.num=num;
	}
}


public class ListMain {

	public static void main(String[] args) {
		
		IntLinkedList l1= new IntLinkedList(3);
		IntLinkedList l2= new IntLinkedList(3);
		IntLinkedList l3= new IntLinkedList(3);
		
		l1.link=l2;
		l2.link=l3;
		
		
		l1.link=new IntLinkedList(5);
		l2.link=new IntLinkedList(5);
		l3.link=new IntLinkedList(5);
		
	
		
		
		// List<String> list = new ArrayList<>(); // 컬렉션 인스턴스 생성
		List<String> list = new LinkedList<>();

		// 컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		// 저장된 문자열 인스턴스의 참조
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');

		// enhanced for문 1.5버전부터(=each for)
		// 변수선언 //객체쓰기
		for (String str : list) {
			System.out.println(str);
		}
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}

		System.out.println();

		list.remove(0); // 첫 번째 인스턴스 삭제

		// 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();

	}

}
