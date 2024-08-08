package Hw_2024_08_07;

import java.util.HashSet;

class Num{
	private int num;
	public Num(int num) {
		this.num=num;
	}
	@Override
	public String toString() {
		return String.valueOf(num); 
	}
	
	@Override
	public int hashCode() {
		return num % 3; 
	}
	@Override
	public boolean equals(Object obj) {
		if(num==((Num)obj).num) {
			return true;
		}else
			return false;
	}
}

public class HashMain {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();

	}

}
