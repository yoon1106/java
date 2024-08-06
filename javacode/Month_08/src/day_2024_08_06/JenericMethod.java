package day_2024_08_06;

class Box1<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class BoxFactory {
//	public static Box1 makeBox(Box1 o) {
//		Box1 box = new Box1();
//		box.set(o);
//		return box;
//	}

	public static <T> Box1<T> makeBox2(T o) {
		Box1<T> box = new Box1<T>();
		box.set(o);
		return box;
	}

	public static <T> T makeBox3(T t) {
	
		return t;
	}
	public static <T> T makeBox4(T t ) {
		
		return t;
	}
}

public class JenericMethod {
	public static void main(String[] args) {
		Box1<String> sbox = BoxFactory.<String>makeBox2("sweet");
		System.out.println(sbox.get());

		Box1<Integer> ibox = BoxFactory.<Integer>makeBox2(1);
		System.out.println(ibox.get());
		
	      Integer i = BoxFactory.<Integer>makeBox3(1);      
	      System.out.println(i); //출력1
	      
	      Double d = BoxFactory.< Double>makeBox3(2.0);      
	      System.out.println(d);
	      

	}
}
