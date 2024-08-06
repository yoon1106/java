
package Hw0806;

class Box<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

class BoxFactory {
	public static <T> Box<T> makeBox2(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	public static <T> T makeBox3(T t) {
		return t;
	}
}

public class BoxGeneric {

	public static void main(String[] args) {
		Box<String> sbox = BoxFactory.<String>makeBox2("sweet");
		System.out.println(sbox.get());

		Box<Integer> ibox = BoxFactory.<Integer>makeBox2(1);
		System.out.println(ibox.get());

		Integer i = BoxFactory.<Integer>makeBox3(1);
		System.out.println(i);

		Double d = BoxFactory.<Double>makeBox3(2.0);
		System.out.println(d);

	}

}
