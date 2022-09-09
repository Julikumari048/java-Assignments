package com.masai;
import java.util.Scanner;

public class Main {


        public static String reversString(String input){
//write the logic

            String revStr = "";
            for(int i = input.length()-1; i>=0; i--){
                revStr = revStr + input.charAt(i);
            }
            return revStr;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String to reverse");
            String orignalString = sc.next();
            String result = reversString(orignalString);
            System.out.println("Original String is :"+ orignalString);
            System.out.println("Reversed String is :"+ result);
        }
    }

