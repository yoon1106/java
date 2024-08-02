package day_2024_08_02;

import java.util.ArrayList;
import java.util.Iterator;

public class RapperMain {
	public static void main(String[] args) { //Number 클래스 추상메소드 호출
		Integer intObj10 = new Integer(29); //Number intObj10 = new Integer(29); 폴리몰피즘으로 같음
		System.out.println(intObj10.doubleValue());
		
		
		ArrayList<Integer>arrList=new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		for (Integer num : arrList) {
			System.out.println(num);
		}
	
		
		
		
		int num = 10;

		Integer iObj = 10; // boxing 박싱
		Integer iObj2 = new Integer(10);
		Integer iObj3 = Integer.valueOf(30);

		int num1 = iObj;// 객체를 기본형으로=언박싱
		num1 = iObj.intValue();
		System.out.println(num1);

		System.out.println(iObj);
		System.out.println(iObj2);
		System.out.println(iObj3);
	}

}
