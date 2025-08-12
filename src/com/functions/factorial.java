package com.functions;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        int fact = 1;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for( int i = 1 ; i<= a;i++){

            fact = fact * i ;

        }
        System.out.println(fact);
    }
}