package com.conditionsandloops;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int yr = input.nextInt();
        if(yr%4 == 0 ) System.out.println("leap year");
        else System.out.println("not a leap year");
    }
}
