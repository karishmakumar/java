package com.functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        summation(a,b);
        multi(a,b);
    }

    private static void multi(int a, int b) {
        System.out.println(a*b);
    }

    private static void summation(int a, int b) {
        System.out.println(a+b);
    }
}
