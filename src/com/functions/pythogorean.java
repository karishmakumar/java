package com.functions;

import java.util.Scanner;

public class pythogorean {

    //Write a function to check if a given triplet is a Pythagorean triplet or not.
    // (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if( Math.pow(c,2) == (Math.pow(b,2)+ Math.pow(a,2))) System.out.println(" its a pythagorean triplet");
        else System.out.println(" its is not a pythogorean triplet");
    }
}
