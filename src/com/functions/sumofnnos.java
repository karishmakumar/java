package com.functions;

import java.util.Scanner;

public class sumofnnos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0 ;

        for( int i = 0 ; i <= n ; i++){
            sum = sum + i ;
        }
        System.out.println("sum of natural nos " + sum);
    }
}
