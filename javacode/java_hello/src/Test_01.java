package java_;

public class Test_01 {

	public static void main(String[] args) {
		short num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1);
		
		short num2 = 7;
		short num3 = (short)(+num2); //+는 int로 형변환 해줘야함
		short num4 = (short)(-num2); //-는 int 
		System.out.println(num3);
		System.out.println(num4);
	}

}
