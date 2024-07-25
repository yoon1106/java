package day_2024_07_24;

import java.util.Scanner;

class RockScissorPaper{
	   private String answer, computer, yesOrNo;
	   private int randInt, myInt;
	   Scanner sc = new Scanner(System.in);
	   
	   public void run() {
	      while(true) {
	         randInt = (int)(Math.random()*3+1);
	         System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
	         answer = sc.next();
	         
	         if(randInt == 1) {
	            computer = "가위";
	         }else if(randInt == 2) {
	            computer = "바위";
	         }else {
	            computer = "보";
	         }
	         
	         if(answer.equals("가위")) {
	            myInt = 1;
	         }else if(answer.equals("바위")) {
	            myInt = 2;
	         }else if(answer.equals("보")) {
	            myInt = 3;
	         }else {
	            System.out.println("잘못된 입력입니다.");
	            continue;
	         }
	         
	         System.out.println(computer);
	         
	         if(myInt == 1 && randInt == 3)
	            randInt %= 3;
	         if(myInt == 3 && randInt == 1)
	            myInt %= 3;
	         
	         if(myInt == randInt) {
	            System.out.println("비겼습니다.");
	         }else if(myInt > randInt) {
	            System.out.println("이겼습니다.");
	         }else {
	            System.out.println("졌습니다.");
	         }
	         
	         System.out.println("계속하시겠습니까?(예/아니오)");
	         yesOrNo = sc.next();
	         if(yesOrNo.equals("예")) {
	            continue;
	         }else {
	            break;
	         }
	      }
	      System.out.println("게임을 종료합니다.");
	   }
	}


public class _05_가위바위보 {
	public static void main(String[] args) {
	      RockScissorPaper game = new RockScissorPaper();
	      game.run();


	}
}
