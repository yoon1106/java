package edu.ict.bean;

public class Grade {
	public Grade(String name, int kor, int eng, int math, int sum, double avg) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.avg = avg;
	}

	public Grade() {
	};

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		sum = kor + math + eng;
		return sum;
	}

	public double getAvg() {
		avg = sum / 3.0;
		return avg;
	}

	public char getGrade() {
		char grade = '가';

	

		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else {
			grade = '가';
		}

		return grade;
	}

}
