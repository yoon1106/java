package java_;

public class While {
	public static void main(String[] args) {
		int count=1;
		
		while(count<=100) {
		System.out.println(count+"번"+"Hello world");
		count++;
		}
		
		//do while 사용
		//차이 do while 실행문장을 한번은! 실행시킨다
		count=1;
		do {
			System.out.println(count+"번"+"Hello world");
			count++;
		}while(count<=10);
		
	}

}
