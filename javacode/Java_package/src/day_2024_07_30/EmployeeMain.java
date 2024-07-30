package day_2024_07_30;

//다형성, 함수오버라이딩 응용

//- 클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
//- 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
//- 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
//- 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력

class Employee {
	private String name;
	private int age;
	private String address;
	private String dept;

	protected int salary;

	public Employee(String name, int age, String address, String dept) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dept = dept;
	}

	public void printInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("주소: " + this.address);
		System.out.println("부서: " + this.dept);

	}
}

class Regular extends Employee {
	
	public Regular(String name, int age, String address, String dept, int salary){
		super(name,age,address,dept);
		setSalary(salary);
	
	}
	
	public void setSalary(int salary) {
		super.salary=salary;
	}
	
	@Override
	public void printInfo() {
		System.out.println("정규직");
		super.printInfo();
		System.out.println("봉급 "+super.salary);
		
	}
}

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee employee = new Employee("홍길동", 27, "서울시", "디자인");
		employee.printInfo();

		employee = new Regular("김철수", 26, "서울시", "마케팅", 2_500_000);
	    employee.printInfo();
	}

}
