
public class Switch {
	public static void main(String[] args) {
		//걸리면 break까지;
		
		int num = 1;

		switch (num) {
		case 1:
			System.out.println("1입니다");
			System.out.println("1입니다");
			
		case 2:
			System.out.println("2입니다");
			System.out.println("2입니다");
			break;

		default:
			System.out.println("디폴트입니다");
			System.out.println("디폴트입니다");
		}
		System.out.println("프로그램 종료합니다.");

	}
}