package day_2024_07_31;
interface Printable2 {
    public void print(String doc);
}

//삼성전자 개발자
class SprinterDriver implements Printable2{

   @Override
   public void print(String doc) {
        System.out.println("From Samsung printer");
        System.out.println(doc);      
   }   
}
//LG전자 개발자
class LprinterDriver implements Printable2{

   @Override
   public void print(String doc) {
	   
	   
        System.out.println("From LG printer");
        System.out.println(doc);      
   }   
}

public class PrinterMain2 {
	public static void main(String args[]) {
        String myDoc = "This is a report about...";
        
        Printable2 prn = new SprinterDriver();
        prn.print(myDoc);
        
        prn = new LprinterDriver();
        prn.print(myDoc);
        
  }
}

