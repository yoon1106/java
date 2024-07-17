//피라미드*그리기
public class _7 {
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
			
		
	}
}
