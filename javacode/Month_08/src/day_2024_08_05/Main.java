package day_2024_08_05;

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

class AppleBox {
	private Apple ap;

	public void set(Apple a) {
		ap = a;
	}

	public Apple get() {
		return ap;
	}
}

class OrangeBox {
	private Orange or;

	public void set(Orange o) {
		or = o;
	}

	public Orange get() {
		return or;
	}
}

// class Box {
//	    private Object ob;
//
//	    public void set(Object o) {
//	        ob = o;
//	    }
//	    public Object get() {
//	        return ob;
//	    }
// }
/*
 * T -> 타입파라미터
 */
class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

public class Main {

	public static void main(String[] args) {
		Box<Apple> abox = new Box<Apple>();
		Box<Orange> obox = new Box<>();
		Box<String> sbox = new Box<>();
		Box<Integer> ibox = new Box<>();
		Box<Double> dbox = new Box<>();
		
		dbox.set(1.0);
		
		
		ibox.set(1);
		int num = ibox.get();// 형변환도 필요없음
		System.out.println(num);

		abox.set(new Apple());
		// abox.set("new Orange()"); //Apple 외에는 다른 타입 못넣음
		Apple ap = abox.get();// 형변환도 필요없음
		System.out.println(ap);

		obox.set(new Orange());
		Orange op = obox.get();// 형변환도 필요없음
		System.out.println(op);

		sbox.set("해킹 안됨");
		String str = sbox.get();// 형변환도 필요없음
		System.out.println(str);

//	      AppleBox aBox = new AppleBox();
//	      OrangeBox oBox = new OrangeBox();
		//
//	      aBox.set(new Apple());
//	      oBox.set(new Orange());
		//
//	      Apple ap = aBox.get();
//	      Orange og = oBox.get();
		//
//	      System.out.println(ap);
//	      System.out.println(og);

		Box aBox = new Box();
		Box oBox = new Box();

		// aBox.set(new Apple());
		// oBox.set(new Orange());

		aBox.set("메롱 버그");
		oBox.set("안녕하세요");

		// Apple ap = (Apple)aBox.get();
		// Orange og = (Orange)oBox.get();

		// System.out.println(aBox.get());
		// System.out.println(oBox.get());

	}
}
