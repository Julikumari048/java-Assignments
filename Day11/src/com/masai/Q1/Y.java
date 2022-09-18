package com.masai.Q1;

public interface Y {
    public abstract void fun1Y();

    default void fun2Y(){
        System.out.println("This is default function 2Y of Interface Y");
    }
    static void fun3Y(){
        System.out.println("This is static function 3Y of Interface Y");
    }


}
