
public class _02 {
	public static double getAvg(int kor, int eng, int math) {
		int total = kor + eng + math;
		int avg = total / 3;
		return avg;

	}
	

	public static char getGrade(double avg) {
		char grade;
		if (avg >= 90) {
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg>=60) {
			grade = '양';
		} else {
			grade = '가';
		}
		return grade;
	}
	
	public static double getCircleArea(double r) {
		double PI=3.14;
		double area= r*r*PI;
		return area;
	
	
	}
	
	public static double getRetangleArea(double width, double height) {
		double area= width*height;
		return area; 
	}

	public static void main(String[] args) {
		double avg = getAvg(70, 80, 70);
		
		
		char grade = getGrade(avg);
		System.out.println("평균은 " + avg + " 입니다.");
		System.out.println("성적은 " + grade + " 입니다.");
		
		
		
		
		System.out.println(getCircleArea(10));
		System.out.println(getRetangleArea(14.5,16.7));
		
	}
}
