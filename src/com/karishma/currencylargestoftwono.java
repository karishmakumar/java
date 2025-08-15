package com.karishma;

import java.util.Scanner;

public class currencylargestoftwono {
    public static void main(String[] args) {
       // Take 2 numbers as input and print the largest number.
        Scanner number = new Scanner(System.in);
        int num1 = number.nextInt();
        int num2 = number.nextInt();

        if ( num1 > num2 ) System.out.println( num1);
        else if (num1 == num2) System.out.println(" equal ");
        else System.out.println(num2);

        //Input currency in rupees and output in USD.
        Scanner currency = new Scanner(System.in);
        int INR = currency.nextInt();
        System.out.println(INR*60);
    }
}
