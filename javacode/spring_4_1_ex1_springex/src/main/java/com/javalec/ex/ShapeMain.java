package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ShapeMain {
	  
	   public static void main(String[] args) {
	      
	      String config = "classpath:appCTX4.xml";
	      
	      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
	      
	      Shape rec = ctx.getBean("rectangle", Shape.class);
	      Shape tri = ctx.getBean("triangle", Shape.class);
	      
	      System.out.println("사각형: "+ rec.getArea());
	      System.out.println("삼각형: "+ tri.getArea());
	   }
}
