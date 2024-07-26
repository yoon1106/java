package day_2024_07_26;

public class _00_배열 {
	public static void main(String[] args) {
	
		int[] ar = new int[5]; //5개방을 잡을때 인덱스는 0부터
		
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		ar[4]=5;
		//System.out.println(ar[0]);
		
		for(int i=0; i<ar.length; i++) {  //length는 1부터 5까지
			ar[i]=i;
			System.out.println(ar[i]);
		}System.out.println(ar[0]);

	}
}
