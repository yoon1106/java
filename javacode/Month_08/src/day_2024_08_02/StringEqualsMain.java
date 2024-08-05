package day_2024_08_02;

public class StringEqualsMain {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = s2;

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		if(s1 == s2)
			System.out.println("s1, s2 참조 대상 같다.");
		else
			System.out.println("s1, s2 참조 대상 다르다. ");
		
		if(s2 == s3)
			System.out.println("s2, s3 참조 대상 같다.");
		else
			System.out.println("s2, s3 참조 대상 다르다. ");
	
		if(s1.equals(s2))
			System.out.println("s1, s2 내용 동일하다.");
		else
			System.out.println("s1, s2 내용 다르다.");
		
		if(s2.equals(s3))
			System.out.println("s2, s3 내용 동일하다.");
		else
			System.out.println("s2, s3 내용 다르다.");

	

	}

}
