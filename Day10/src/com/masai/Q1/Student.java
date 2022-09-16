package com.masai.Q1;

import java.util.Scanner;

abstract public class Student {
    String name;
    String address;

    abstract void getPercentage( );

     public Student(String name, String address) {
         this.name = name;
         this.address = address;
     }

 }

   class ScienceStudent extends Student{

      int phisicsMarks;
      int chemistryMarks;
      int mathsMarks;


       public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
           super(name, address);
           this.phisicsMarks = phisicsMarks;
           this.chemistryMarks = chemistryMarks;
           this.mathsMarks = mathsMarks;
       }

       void getPercentage(){
          int stuMarks = 300;
          int stuGetMarks = phisicsMarks+chemistryMarks+mathsMarks;
          double percentage = (stuGetMarks*100/stuMarks);
           System.out.println("Total Percentage of Science Student: "+percentage);
      }
   }

  class HistoryStudent extends Student{

     int historyMarks;
     int civicsMarks;

      public HistoryStudent(String name, String address,int historyMarks,  int civicsMarks) {
          super(name, address);
          this.historyMarks = historyMarks;
          this.civicsMarks = civicsMarks;

      }

      void getPercentage(){
          int stuMarks = 200;
          int stuGetMarks = historyMarks+civicsMarks;
          double percentage = (stuGetMarks*100/stuMarks);
          System.out.println("Total Percentage of Science Student: "+percentage);
      }
 }

 class AllStudents{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, Address,phisicsMarks,chemistryMarks,mathsMarks of Science Student");
        ScienceStudent  scie = new ScienceStudent(sc.next(),sc.next(),sc.nextInt(), sc.nextInt(), sc.nextInt());


        System.out.println("Enter Name, Address,historyMarks,civicsMarks of History Student");
        HistoryStudent hist = new HistoryStudent(sc.next(),sc.next(),sc.nextInt(), sc.nextInt());

       // String name;
        System.out.println("Student Name is: "+scie.name);
        System.out.println("Student Address is: "+scie.address);
        System.out.println("Student phisicsMarks is: "+scie.phisicsMarks);
        System.out.println("Student chemistryMarks is: "+scie.chemistryMarks);
        System.out.println("Student mathsMarks is: "+scie.mathsMarks);
        scie.getPercentage();

        System.out.println("==================");

        System.out.println("Student Name is: "+hist.name);
        System.out.println("Student Address is: "+hist.address);
        System.out.println("Student historyMarks is: "+hist.historyMarks);
        System.out.println("Student civicsMarks is: "+hist.civicsMarks);
        hist.getPercentage();
    }
}