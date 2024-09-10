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
public class CircleVO  {
	private int radius;
;
	
	public double getArea() {
		return radius*radius*Math.PI;
	}

}
