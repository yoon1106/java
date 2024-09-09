package com.javalec.ex;



public class Grade {
   
   private int kor, eng, math;
   
   public Grade() {}
   
   public Grade( int kor, int eng, int math) {
      this.kor = kor;
      this.eng = eng;
      this.math = math;      
   }
   
   public int getKor() {
      return kor;
   }

   public void setKor(int kor) {
      this.kor = kor;
   }

   public int getEng() {
      return eng;
   }

   public void setEng(int eng) {
      this.eng = eng;
   }

   public int getMath() {
      return math;
   }

   public void setMath(int math) {
      this.math = math;
   }


   

   
   public char getGrade() {
      char grade = '가';
      
      double avg = (kor + eng + math) / 3.0;
      
      if (avg >= 90) {
         grade = '수';
      } else if (avg >= 80) {
         grade = '우';
      } else {
         grade = '가';
      }

      return grade;
   }
   
   public double getAvg() {
      return  (kor + eng + math) / 3.0;
   }
   
   
}
