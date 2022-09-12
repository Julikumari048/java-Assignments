package Question3;

import java.util.Scanner;

public class Student {
 int roll;
 String name;
 String address;
 int marks;
    Student(int r, String name, String add,  int marks){
        this.roll = r;
        this.name = name;
        this.address = add;
        this.marks = marks;

    }
}
 class Demo{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Input number of Student");
         Student[] stu  = new Student[sc.nextInt()];
         for(int i = 0; i < stu.length; i++) {
             System.out.println("Enter roll, Enter name, Enter address, Enter Marks");
             stu[i] = new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
         }

         int sum = 0;
//         int avg=1;
             for(int i = 0; i < stu.length; i++) {

                 System.out.println("Student Name is:" + stu[i].name);
                 System.out.println("Student Roll is:" + stu[i].roll);
                 System.out.println("Student Address is:" + stu[i].address);
                 System.out.println("Student Marks is:" + stu[i].marks);
                 System.out.println("=====================");

                 sum = (sum + stu[i].marks);
                  //avg = sum/stu.length;
             }
                   int avg = sum/stu.length;
                   System.out.println("Average Marks: "+avg);
     }


     }

