package Hw_2024_08_07;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		Set<Integer> ks = map.keySet();

		// for-each문에 의한 반복
		for (Integer n : ks) {
			System.out.println(n.toString() + '\t');
			System.out.println();
		}

		// Iterator 반복자에 의한 반복
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();

	}

}
