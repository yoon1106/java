package day_2024_08_08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeyValueMain {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>(); // 폴리몰티즘으로 Map말고 HashMap써도된다

		// Key-Value 기반 데이터 저장
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		System.out.println("1 " + map.containsKey(45)); // 45 key를 가진 객체가 있는지 확인
		System.out.println("2 " + map.containsKey(60));
		System.out.println("3 " + map.containsValue("Brown")); //Brown value 가진 객체가 있는지 확인
		System.out.println("4 " + map.isEmpty()); // 안에 데이터없으면 true, 있으면 false
		System.out.println("5 " + map.size());
		System.out.println("6 " + map);
		System.out.println("7 " + map.replace(23, "이름"));// key는 수정불가 value만 수정 가능
		// 데이터 탐색
		System.out.println("23번: " + map.get(23));
		System.out.println("37번: " + map.get(37));
		System.out.println("45번: " + map.get(45));

		// 데이터 삭제
		// map.remove(37);

		// 데이터 삭제 확인
		System.out.println("37번: " + map.get(37));

		// Key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();

		// 전체 Key 출력 (for-each문 기반)
		for (Integer n : ks)
			System.out.print(n.toString() + '\t');
		System.out.println();

		// 전체 Value 출력 (for-each문 기반)
		for (Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();

		// 전체 Value 출력 (반복자 기반)
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();

	}

}
