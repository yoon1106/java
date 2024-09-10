package edu.ict.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor //생성자
@NoArgsConstructor //디폴트 생성자
//위에 4가지 한번에 할거면 @Data 단 실무에서 객체의 안정성을 지키기 때문에 지양한다
@ToString

public class GradeVO  {
	private int kor;
	private int eng;
	private int math;
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return getTotal()/3.0;
	}
}
