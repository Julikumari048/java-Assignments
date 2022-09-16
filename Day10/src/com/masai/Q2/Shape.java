package com.masai.Q2;

 abstract public class Shape {

   abstract  int rectangleArea(int length, int breadth);
    abstract  int squareArea(int side);
    abstract  int circleArea(int radius);
}

  class Area extends Shape{
     public int rectangleArea(int length, int breadth){
         int  rectunArea= length*breadth;
         return rectunArea;
     }

     public int squareArea(int side){
         int squeArea = side*side;
         return squeArea;

     }
     public int circleArea(int radius){
        int  circArea = (int) (3.14*radius*radius);
        return circArea;
     }
  }

  class Main{
      public static void main(String[] args) {
          Area ar = new Area();
        int rec =  ar.rectangleArea(4,5);
        int sq =  ar.squareArea(4);
        int cr =  ar.circleArea(7);

          System.out.println("Area of Rectangular: "+rec);
          System.out.println("Area of Square: "+sq);
          System.out.println("Area of Circle: "+cr);
      }
  }
