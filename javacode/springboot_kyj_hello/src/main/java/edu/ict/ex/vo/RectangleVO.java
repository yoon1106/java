package edu.ict.ex.vo;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RectangleVO  {
	private int width;
	private int height;
	
	public double getArea() {
		return width*height;
	}

}
