package day_2024_08_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMain {
	public static void print() throws ArrayIndexOutOfBoundsException {
		System.out.println("안녕하세요.");
	}

	public static void print2() throws Exception {
		int a = 0 / 0;
		System.out.println("안녕하세요.");
	}

	public static void main(String[] args) {

		print();
	      
//      print2();

      try {
         print2();
      } catch (Exception e) {
         e.printStackTrace();
      }

      File file = new File("abcd.txt");
      try {
         Scanner sc = new Scanner(file);
      } catch (FileNotFoundException e) {
         System.out.println("파일이 없습니다.");
         e.printStackTrace();
      }

	}

}
