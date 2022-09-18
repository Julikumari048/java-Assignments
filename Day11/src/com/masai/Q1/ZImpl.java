package com.masai.Q1;

 public class ZImpl implements Z{
      @Override
     public void funZ(){
          System.out.println("This is override function Z of class ZImpl");
     }

     @Override
     public void fun2X(){
         System.out.println("This is function 2X of class ZImpl");
     }
     @Override
     public void fun1X(){
         System.out.println("This is function 1X of class ZImpl");
     }

     @Override
     public void fun1Y(){
         System.out.println("This is function 1Y of class ZImpl");
     }
}


class Demo{
    public static void main(String[] args) {
        ZImpl zm = new ZImpl();
        zm.fun1X();
        zm.fun2X();
        zm.fun1Y();
        zm.fun2Y();
        zm.funZ();
        X.fun3X();
        Y.fun3Y();

    }
}