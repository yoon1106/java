//피라미드*그리기
public class _06_피라미드 {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {

			for (int j = i; j < 4; j++) {

				System.out.print(" ");

			}

			for (int j = 1; j <= 2 * i - 1; j++) {

				{
					System.out.print("*");
				}

			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for (int i = 1; i <=5; i++) {
			for (int j = i; j <5; j++) {
				System.out.print("1");
			}
			for (int j = 1; j <=(2*i-1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
