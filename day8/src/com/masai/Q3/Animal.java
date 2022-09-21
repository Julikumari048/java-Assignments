package com.masai.Q3;

public class Animal {
    public void makeNoise() {
        System.out.println("Animal making Noise");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void walk() {
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{

    @Override
    public void makeNoise() {

        System.out.println("Barking...");
    }

}

class Cat extends Animal{

    @Override
    public void makeNoise() {

        System.out.println("Meaw...");
    }

}

class Tiger extends Animal{
    @Override
    public void makeNoise() {

        System.out.println("Roaring...");
    }

}

 class Main{
     public static void main(String[] args) {
         Animal[] arr = new Animal[3];
         arr[0] = new Dog();
         arr[1] = new Cat();
         arr[2] = new Tiger();

         for(int i = 0; i < arr.length; i++){
             arr[i].eat();
             arr[i].walk();
             arr[i].makeNoise();
             System.out.println("====================");

         }
     }
 }