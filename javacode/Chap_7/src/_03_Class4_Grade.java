
class Grade {
	int kor, eng, math;
	double avg;
	char grade;

	void setKor(int kor) {
		this.kor = kor;
	}

	void setEng(int eng) {
		this.eng = eng;
	}

	void setMath(int math) {
		this.math = math;
	}

	int getKor() {
		return kor;
	}

	int getEng() {
		return eng;
	}

	int getMath() {
		return math;
	}

	double getAvg() {
		avg = (kor + eng + math) / 3.0;
		return avg;
	}

	char getCharGrade() {
		avg = (kor + eng + math) / 3.0;

		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		return grade;
	}

	void getGrade() {
		System.out.println("성적은" + grade + "입니다");
	}

	public void checkGradeObject(Grade g) {
		g.getGrade();
	}
}

public class _03_Class4_Grade {
	public static void main(String[] args) {

		Grade grade = new Grade();
		grade.setKor(90);
		grade.setEng(100);
		grade.setMath(100);

		System.out.println("국어" + grade.getKor());
		System.out.println("영어" + grade.getEng());
		System.out.println("수학" + grade.getMath());

		System.out.println(grade.getCharGrade() + "입니다");
		grade.getGrade(); // 성적은 수입니다

		grade.checkGradeObject(grade); // 성적은 수입니다

	


	}
}
