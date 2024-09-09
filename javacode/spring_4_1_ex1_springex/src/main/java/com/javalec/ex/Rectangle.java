package com.javalec.ex;

public class Rectangle implements Shape {

	private double width;

	private double height;

	@Override
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
