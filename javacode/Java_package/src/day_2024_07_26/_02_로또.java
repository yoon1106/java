package day_2024_07_26;

import java.util.Arrays;

//로또 1~45, 6개 중복제거

public class _02_로또 {
	public static void main(String[] args) {

		int[] arrLotto = new int[6]; // final int LOTTO_COUNT=6; int[] arrlotto = new int[LOTTO_COUNT];

		// 입력
		for (int i = 0; i < arrLotto.length; i++) {
			arrLotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				
				while (arrLotto[j] == arrLotto[i]) {
					arrLotto[i] = (int) (Math.random() * 45 + 1);				
				}
			}

		}

		
		
		System.out.println(Arrays.toString(arrLotto));

		// 출력
//		for (int i = 0; i < arrlotto.length; i++) {
//
//			System.out.print(arrlotto[i]);
//		}

		
		
		//선생님이 한 방법 
		
//	      final int LOTTO_COUNT = 6;
//	      
//	      int[] arrLotto = new int[LOTTO_COUNT];
//	      
//	      //입력
//	      for(int i=0; i < arrLotto.length; i++) {
//	         arrLotto[i] =  (int) ((Math.random() * 45) + 1);
//	         
//	         for(int j =0; j < i; j++) {
//	            if(arrLotto[j] == arrLotto[i]) {
//	               i--;
//	               break;
//	            }
//	         }         
//	      }
//	      
//	      System.out.println(Arrays.toString(arrLotto));

	}
}
