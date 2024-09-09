package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {

    	private String name;
    	private int age;
    	private ArrayList<String>hobbys; 
    	
    	private Grade grade;
    	
    	public Student() {} //디폴트 생성자 
    	
    	
    	public Grade getGrade() {
			return grade;
		}

		public void setGrade(Grade grade) {
			this.grade = grade;
		}

		public ArrayList<String> getHobbys() {
			return hobbys;
		}

		public void setHobbys(ArrayList<String> hobbys) {
			this.hobbys = hobbys;
		}

	
    	public Student(String name, int age) {
    		this.name=name;
    		this.age=age;
    	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public void afterPropertiesSet() throws Exception{
			System.out.println("초기화 콜백");
		}
		
		@Override
		public void destroy() throws Exception{
			System.out.println("디스트로이 콜백");
		}
    
}
