package day_2024_08_06;
	
class Box<I>{
	private I count;
	
	
	public void set(I count){
		this.count=count;
		
	}

	public I get() {
		return count;
	}

}

public class Main {

	public static void main(String[] args) {
	       Box<Integer> ibox = new Box<>();
           Box<Double> dbox = new Box<>();
           
           dbox.set(1.0);
           double dNum = dbox.get();//형변환도 필요없음                
           System.out.println(dNum);

	}

}
