package com.karishma;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers.
        // 0 1 1 2 3 5

        int a = 0;
        int b = 1;
        int c = 0;

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
//        System.out.println( a );
//        System.out.println( b );

        for (int i = 2 ; i <= num ; i++) {
             c = a + b;
            a = b ;
            b = c ;
        }
        System.out.println(c);
    }
}

