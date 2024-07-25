package day_2024_07_25;

public class _04_문자열 {
	public static void main(String[] args) {

	    String st1="abcdefg";
		String st2 = st1.substring(2);
		System.out.println(st2);

		String st3 = st1.substring(2, 4); // 끝자리위치한 4는 포함안시킨다
		System.out.println(st3);

		// 아래코딩처럼 for 하지말기 용량초과된다
		String st5 = "abcdefg" + "100" + "양" + 1;
		for (int i = 0; i < 5000000; i++) {
			st5 = st5 + "A";
		}
	}

}
