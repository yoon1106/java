package day_2024_07_30;

class MobilePhone {
	protected String number; // 전화번호

	public MobilePhone(String num) {
		number = num;
	}

	public void answer() {
		System.out.println("Hi~ from " + number);
	}
	
	
}

class SmartPhone extends MobilePhone {
	protected String androidVer; // 안드로이드 운영체제 네임(버전)

	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

public class ISA_Main {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-555-777", "Nougat");
		
		phone.answer();
		phone.playApp();
		
		//다형성 (polymorphism)=폴리몰리즘
		MobilePhone ph2=new SmartPhone("010-999-333","Nougat");
		ph2.answer();
		//ph2.playApp();
		
	}

}
