package com.javalec.ex;

import org.springframework.context.annotation.Bean;



public class ApplicationConfig {
	
	//<bean id="student1" class="com.javale.ex.Student"></bean>
	
	//하나의 기능을 가진 함수
	@Bean
	public Student student1(){
		Student student = new Student("홍길동",25);
		return student;
	}
	@Bean
	public Student student2(){
		Student student = new Student("홍길순",30);
		return student;
	}
}
