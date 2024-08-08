package Hw_2024_08_07;

import java.util.HashSet;
import java.util.Set;

public class LottoSet {

	public static void main(String[] args) {
		Set<Integer>Lotto=new HashSet<>();
		
		final int COUNT=6;
		
		while (Lotto.size()<COUNT) {
			Lotto.add((int)(Math.random()*45+1));
		}
		System.out.println(Lotto);
	}

}
