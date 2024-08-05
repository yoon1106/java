package day_2024_08_05;

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

public class StackMain {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      StringStack stack;

	      System.out.print("총 스택 저장 공간의 크기 입력 >> ");
	      stack = new StringStack(sc.nextInt());

	      while (true) {

	         System.out.print("문자열 입력");
	         String str = sc.next();

	         if (str.equals("그만")) {
	            break;
	         }

	         boolean isFull = stack.push(str);

	         if (isFull == false) {
	            System.out.println("스택이 꽉 차서 푸시 불가!");
	         }
	      }

	      System.out.print("스택에 저장된 모든 문자열 팝 :");
	      for (int i = 0; i < stack.length(); i++) {
	         System.out.print(stack.pop() + " ");
	      }

	   }
	}

