
public class _02_Break2 {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;

		while ((num++) < 100) {
			if (((num % 3) != 0) || ((num % 4) != 0))
				continue; //3과 4의 배수아니라면 나머지 건너뛰고 위로 이동

			count++;//3과    for(;;) {
			System.out.println("Hello world");
		}
			System.out.println(num);// 3와4의 배수인경우만 실행
		}
		System.out.println("count" + count);
	
}

