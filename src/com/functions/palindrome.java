package com.functions;
import java.util.Scanner;


public class palindrome {

   //Write a function to find if a number is a palindrome or not. Take number as parameter.
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();

       int temp = a , reverse = 0;
       while (temp != 0) {
           reverse = (reverse * 10) + (temp % 10);
           temp = temp / 10;
       }

       if( a == reverse) System.out.println("palindrome");
       else System.out.println("not a palindrome");

       }
   }
