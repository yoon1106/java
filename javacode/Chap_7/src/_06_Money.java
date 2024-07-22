class Money{
	int money;
 void setMoney(int money) {
	 this.money=money;
 }
 void show() {     
     int money50000, money10000, money5000, money1000, money500, money100;
     int saveMoney = money;
     
     money50000 = saveMoney / 50000;
     saveMoney = saveMoney % 50000;
     
     money10000 = saveMoney / 10000;
     saveMoney = saveMoney % 10000;
     
     money5000 = saveMoney / 5000;
     saveMoney = saveMoney % 5000;
     
     money1000 = saveMoney / 1000;
     saveMoney = saveMoney % 1000;
     
     money500 = saveMoney / 500;
     saveMoney = saveMoney % 500;
     
     money100 = saveMoney / 100;
     saveMoney = saveMoney % 100;
     
     System.out.println(money);
     System.out.println("오만원:"+money50000+"장");
     System.out.println("만원:"+money10000+"장");
     System.out.println("오천원:"+money5000+"장");
     System.out.println("천원:"+money1000+"장");
     System.out.println("오백원:"+money500+"개");
     System.out.println("백원:"+money100+"개");
     

     

 }
}
public class _06_Money {

	public static void main(String[] args) {

		Money money=new Money();
		money.setMoney(1456000);
		money.show();

	}
}