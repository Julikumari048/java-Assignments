package com.masai.Q1;

public class Bird {

    void fly(){
        System.out.println("Bird is flying");
    }
}

 class Parrot extends Bird {
     @Override
     void fly() {
         System.out.println("I am flying");
     }

     public void sing(){
         System.out.println("I am Singing");
     }
 }

 class main{
     public static void main(String[] args) {

         Bird b1 = new Parrot();
         b1.fly();
         Parrot p = (Parrot)b1;
         p.sing();
     }
  }