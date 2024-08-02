package day_2024_08_01;

import java.util.InputMismatchException;

import java.util.Scanner;

class Person {
	String name;
	int age;
	String addr;

	Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public void showInfo() {
		System.out.println("이름 " + this.name);
		System.out.println("나이 " + this.age);
		System.out.println("주소 " + this.addr);
	}

}

class Student extends Person {
	String school;
	String major;
	int id;

	Student(String name, int age, String addr, String school, String major, int id) {
		super(name, age, addr);
		this.school = school;
		this.major = major;
		this.id = id;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("학교: " + this.school);// this 는 자기꺼기때문에 this.은 생략해도 괜찮다
		System.out.println("학과: " + this.major);
		System.out.println("학번: " + this.id);
	}

	public void average() {
		Scanner sc = new Scanner(System.in);
		double[] answer = new double[8];
		System.out.println("8학기 학점을 순서대로 입력하세요");

		double sum = 0;
		double average;
		for (int i = 0; i < answer.length; i++) {
			System.out.print((i + 1) + "학기 학점 -> ");

			try {
				answer[i] = sc.nextDouble();
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println("에러입니다");
				return;
			}

			sum += answer[i];

		}
		average = sum / answer.length;
		System.out.println("8학기 총 평균 평점은" + average + "점 입니다");
	}
}

public class ExceptionMain2 {

	public static void main(String[] args) {
		Student stu = new Student("김다정", 20, "서울시", "동양서울대학교", "전산정보학과", 20132222);
		stu.showInfo();
		stu.average();
	}

}
