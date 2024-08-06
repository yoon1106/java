package day_2024_08_06;

import java.util.Scanner;

interface Stack3 {
	int length(); // 현재 스택에 저장된 개수 리턴

	int compacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 톱(top)에 저장

	boolean push(String val); // 스택의 톱(top)에 저장된 문자 리턴
}

class StringStack3 implements Stack3 {

	private String arrStr[];
	private int index; // top

	public StringStack3() {
		arrStr = new String[3];
		index = 0;
	}

	public StringStack3(int size) {
		arrStr = new String[size];
		index = 0;
	}

	@Override
	public int length() {
		return index;
	}

	@Override
	public int compacity() {
		return arrStr.length;
	}

	@Override
	public String pop() {

		if (index == 0)
			return "비어있음";
		else {
			String str = arrStr[index - 1];
			index--;
			return str;
		}

	}

	@Override
	public boolean push(String val) {

		String arrTemp[];

		if (index == arrStr.length) {
			arrTemp = new String[arrStr.length * 2]; // 배열을 2배로 늘리고

			for (int i = 0; i < arrStr.length; i++) { // 기존에 있던 값을 새로운 배열로 이동
				arrTemp[i] = arrStr[i];
			}

			arrStr = arrTemp; // 기존의 배열을 새로운 배열로 교체
		}

		arrStr[index++] = val;

		return true;

	}
}

public class StackMain_Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringStack3 stack3 = new StringStack3();

		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		stack3 = new StringStack3(sc.nextInt());

		while (true) {

			System.out.print("문자열 입력");
			String str = sc.next();

			if (str.equals("그만")) {
				break;
			}

			boolean isFull = stack3.push(str);

			if (isFull == false) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}

		System.out.print("스택에 저장된 모든 문자열 팝 :");

		int length = stack3.length();

		for (int i = 0; i < length; i++) {
			System.out.print(stack3.pop() + " ");
		}

	}
}
