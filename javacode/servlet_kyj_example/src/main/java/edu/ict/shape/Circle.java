package edu.ict.shape;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LottoAnswer
 */

public class Circle  {
	   
	   private double radius;
	   
	   public Circle(double radius) {
	      this.radius = radius;
	   }
	   public void setRadius(int r) {
	      radius = r;
	   }
	   
	   public double getRadius() {
	      return radius;
	   }
	   
	   public double getArea() {
	      return radius * radius * Math.PI;
	   }

}
