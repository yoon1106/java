package day_2024_08_06;

import java.util.Scanner;

interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴

	int compacity(); // 스택의 전체 저장 가능한 개수 리턴

	String pop(); // 스택의 톱(top)에 저장

	boolean push(String val); // 스택의 톱(top)에 저장된 문자 리턴
}

class StringStack implements Stack {

	private String arrStr[];
	private int index; // top

	public StringStack(int size) {
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

		if (index == arrStr.length)
			return false;
		else {
			arrStr[index] = val;
			index++;
			return true;
		}
	}
}

class StringStack2 implements Stack {

	private String arrStr[];
	private int index; // top

	public StringStack2() {
		arrStr = new String[3];
		index = 0;
	}

	public StringStack2(int size) {
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

public class StackMain2 {

	public static void main(String[] args) {
	      
	      StringStack2 stack2 = new StringStack2();
	      
	      stack2.push("멤롱");
	      stack2.push("멤롱");
	      stack2.push("멤롱");
	      stack2.push("멤롱");
	      stack2.push("멤롱");
	      stack2.push("멤롱");
	      stack2.push("멤롱");
	      stack2.push("멤롱");
	      
	      int length = stack2.length();
	      
	      for (int i = 0; i < length; i++) {
	         System.out.print(stack2.pop() + " ");
	      }

	      
	      
	      
	      
//	      Scanner sc = new Scanner(System.in);
//	      StringStack stack;
	//
//	      System.out.print("총 스택 저장 공간의 크기 입력 >> ");
//	      stack = new StringStack(sc.nextInt());
	//
//	      while (true) {
	//
//	         System.out.print("문자열 입력");
//	         String str = sc.next();
	//
//	         if (str.equals("그만")) {
//	            break;
//	         }
	//
//	         boolean isFull = stack.push(str);
	//
//	         if (isFull == false) {
//	            System.out.println("스택이 꽉 차서 푸시 불가!");
//	         }
//	      }
	//
//	      System.out.print("스택에 저장된 모든 문자열 팝 :");
//	      
//	      int length = stack.length();
//	      
//	      for (int i = 0; i < length; i++) {
//	         System.out.print(stack.pop() + " ");
//	      }

	   }
	}

		
