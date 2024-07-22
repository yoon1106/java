
public class _8_StringMain {
	public static void printString(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		String name="홍길동"; //name data type string(참조형)
		System.out.println(name);
		
		String name2=new String("AAA");
		System.out.println(name);
		System.out.println(name2);
		System.out.println("--------");
		
		String str1= "Happy";
		String str2= "Birthday";
		System.out.println(str1+" "+str2);
		System.out.println("--------");
		
		printString(str1);
		printString(str2);
		
	}
}