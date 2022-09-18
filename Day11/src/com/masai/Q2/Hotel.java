package com.masai.Q2;

import java.util.Scanner;

public interface Hotel {

    void chickenBiryani();
    void masalaDosa();
}

 class TajHotel implements Hotel{


     @Override
     public void chickenBiryani() {
         System.out.println("chickenBiryani from TajHotel");
     }

     @Override
     public void masalaDosa() {
         System.out.println("masalaDosa from TajHotel");
     }

     public void welcomeDrink(){
         System.out.println("Welcome Drink from the TajHotel");
     }
 }
 class RoadSideHotel implements Hotel {

     @Override
     public void chickenBiryani() {
         System.out.println("chickenBiryani from RoadSideHotel");
     }

     @Override
     public void masalaDosa() {
         System.out.println("masalaDosa from RoadSideHotel");
     }
 }

 class Demo {

     public Hotel provideFood ( int amount){
         if (amount > 1000) {
             TajHotel tj = new TajHotel();
             return tj;
         } else if (amount > 200 && amount < 1000) {
             RoadSideHotel rsh = new RoadSideHotel();
             return rsh;
         } else {
             return null;
         }
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Demo dm = new Demo();
         System.out.println("Enter The Amount");
         int am = sc.nextInt();
         Hotel orderAm = dm.provideFood(am);

          if(orderAm instanceof TajHotel){
             orderAm.chickenBiryani();
             orderAm.masalaDosa();
             ((TajHotel) orderAm).welcomeDrink();

         }
         else if(orderAm instanceof RoadSideHotel){
             orderAm.chickenBiryani();
             orderAm.masalaDosa();

         }
         else{
             System.out.println("Please Enter a valid amount");
         }
     }
 }