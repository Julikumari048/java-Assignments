package com.masai;

import java.util.Scanner;
import java.lang.String;

public class GetString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        System.out.println("Enter a position");
        int i = sc.nextInt();
       char ans = s.charAt(i);
        System.out.println("Index of the string is: "+ans);
    }
}
