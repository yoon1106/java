package day_2024_08_08;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

class Country {
	private HashMap<String, Integer> map;

	public Country() {
		map = new HashMap<>();
	}

	public void getMap() {

		Scanner sc = new Scanner(System.in);
		int people;
		String country;
		System.out.println("나라 이름과 인구를 입력하세요.");
		while (true) {
			System.out.print("나라이름, 인구>>");
			try {
				   String stop=sc.next();
				    country = sc.next();
					people = sc.nextInt();
					map.put(country, people);
					if (stop.equals("그만")) {
						break;
					}
			} catch (Exception InputMismatchException) {
			System.out.println("나라는 없습니다");
			}
			 
			
	
		}
	while(true) {
		Scanner ac= new Scanner(System.in);
		 String stop=sc.next();
		System.out.print("인구검색>>");
		country = sc.next();
		if(map.containsKey(country)) {
			System.out.println(country+"나라는 없습니다");
		}
		if (stop.equals("그만")) {
			break;
		}
		
	}

	}

}

public class CountryMain {

	public static void main(String[] args) {
		Country country = new Country();
		country.getMap();
	}

}
