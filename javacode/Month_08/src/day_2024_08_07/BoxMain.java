package day_2024_08_07;

//class Box<T>{
//	private T t;
//	public void set(T t) {
//		this.t=t;
//	}
//	public T get() {
//		return t;
//	}
//}

public class BoxMain {
	private static <T> boolean compBox(Box<T> box, T t) {
		boolean isTrue=true; //불리안 이름지을때 is붙이면 편하다
		
		if (box.get().equals (t)) {
			isTrue=true;
			
		} else {
			isTrue=false;
			
		}
		
			return isTrue;
		
	}

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(24);
		Box<String> box2 = new Box<>();
		box2.set("Poly");
		if (compBox(box1, 25))
			System.out.println("상자 안에 25 저장");
		if (compBox(box2, "Moly"))
			System.out.println("상자 안에 Moly 저장");
		System.out.println(box1.get());
		System.out.println(box2.get());

	}

}
