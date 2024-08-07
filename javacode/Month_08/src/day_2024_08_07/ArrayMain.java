package day_2024_08_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int max = 0;
		int i = 0;

		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 >> ");
			list.add(sc.nextInt());
			if (max < list.get(i)) {
				max = list.get(i);
			}
			if (list.get(i++) < 0) {
				System.out.println("음수 입력되어서 종료합니다");
				break;
			}
		}
		System.out.println(max);
	}

}
