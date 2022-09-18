package com.masai.Q1;

public interface X {
    public abstract void fun1X();
    default void fun2X(){
        System.out.println("This is default function 2X of Interface X");
    }
    static void fun3X(){
        System.out.println("This is Static function 3X of Interface X");
    }

}
