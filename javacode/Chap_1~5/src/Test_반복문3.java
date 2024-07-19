public class Test_반복문3 {
	public static void main(String[] args) {
		// 100 98 96 94 ...2
		for (int i = 100; i >= 2; i--) {

			System.out.println(i);
		}

		for (int i = 100; i >= 2; i--) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		// 1부터 100까지의 수중에서 3의 배수가 아닌 수들의 합은?

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0)
				sum = sum + i;
			System.out.println(sum);
		}
		//1에서 100까지 3의 배수를 더하는 while 문을 사용하시오
		int i=1;
		sum=0;
		while(i<=100) {
			if(i%3==0) {
				sum=sum+i;
		System.out.println(i);
		i++;
			}
		}
	}
}
