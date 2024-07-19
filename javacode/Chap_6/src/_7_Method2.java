
public class _7_Method2 {
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;

		return addResult;

	}

	public static double square(double num) {
		return num * num;
	}

	public static double getAvg(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		double avg = total / 3.0; // 3.0때문에 자동형변환

		return avg;
		// return (num1+num2+num3)/3.0;
	}

	public static char getGrade(double avg) {
		char grade;
		
		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else {
			grade = '가';
		}

		return grade;

	}

	public static void main(String[] args) {
		int result;
		result = adder(4, 5);
		System.out.println(result);

		System.out.println(square(3.5));

		double avg = getAvg(70, 80, 60);

		char grade = getGrade(avg);

		
		System.out.println("평균은 "+avg+" 입니다"); 
		System.out.println("성적은 "+grade+" 입니다"); 

	}

}
