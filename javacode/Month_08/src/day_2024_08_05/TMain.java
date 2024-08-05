package day_2024_08_05;

class DBox<T,U>{
	private T str;
	private U count;
	
	public void set(T str,U count) {
		this.str=str;
		this.count=count;
	}
	
	@Override
	public String toString() {
		return str +" & "+ count;
	}
}

public class TMain {

	public static void main(String[] args) {
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box); // Apple & 25
        
        DBox<String, String> box2 = new DBox<String, String>();
        box2.set("Apple", "Orange");
        System.out.println(box2); // 
        
	}

}
