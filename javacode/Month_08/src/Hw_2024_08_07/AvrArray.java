package Hw_2024_08_07;

import java.util.ArrayList;
import java.util.Scanner;

class Grade {
	private ArrayList<String> list;
	final int NUM = 6;

	public Grade() {
		list = new ArrayList<String>();
	}

	public void inputGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("6개 학점을 'A', 'B', 'C', 'D', 'F'로 입력하시오");
		while (list.size() < NUM) {
			list.add(sc.next());
		}
	}

	public double getAvg() {
		double sum = 0;
		double avg = 0;

		for (String str : list) {

			switch (str) {
			case "A": {

				sum += 4.0;
				break;
			}
			case "B": {

				sum += 3.0;
				break;
			}
			case "C": {

				sum += 2.0;
				break;
			}
			case "D": {

				sum += 1.0;
				break;
			}
			case "F": {

				sum += 0;
				break;
			}

			default:
				System.out.println("A, B, C, D, F로 입력해주세요");
			}

			avg = sum / NUM;

		}

		return avg;
	}
}

public class AvrArray {

	public static void main(String[] args) {
		Grade grade = new Grade();
		grade.inputGrade();
		System.out.println("평균점수: " + grade.getAvg());

	}

}
