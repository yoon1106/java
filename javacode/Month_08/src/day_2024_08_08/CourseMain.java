package day_2024_08_08;

import java.util.Scanner;

public class CourseMain {

	public static void main(String[] args) {

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("과목 이름 >> ");
			String input = scanner.nextLine();

			if (input.equals("그만")) {
				break;
			}

			boolean isfound = false;
			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(input)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					isfound = true;
					break;
				}
			}

			if (!isfound) {
				System.out.println("없는 과목입니다.");
			}
		}

	}

}
