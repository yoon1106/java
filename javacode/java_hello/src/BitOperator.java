

public class BitOperator {
	public static void main(String[] args) {
	byte n1 = 5;  //00000101
	byte n2 = 3;  //00000011
	byte n3 = -1; //

	
	byte r1= (byte)(n1 & n2); //00000001
	byte r2= (byte)(n1 | n2); //00000111
	byte r3= (byte)(n1 ^n2); //00000110
	byte r4= (byte)(~n3);  //00000000
		
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	}

}
