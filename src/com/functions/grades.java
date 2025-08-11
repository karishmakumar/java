package com.functions;

import java.util.Scanner;

public class grades {

   // Write a program that will ask the user to enter his/her marks (out of 100).
    // Define a method that will display grades according to the marks entered as below:

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" please enter your marks out of 100");
        int num = in.nextInt();
        checkgrade(num);

    }

    private static void checkgrade(int num) {
        int grade = num / 10;
        switch (grade) {
            case 10:
                System.out.println("AA");
                break;
            case 9:
                System.out.println("AB");
                break;
            case 8:
                System.out.println("BB");
                break;
            case 7:
                System.out.println("BC ");
                break;
            case 6:
                System.out.println("CD");
                break;
            case 5:
                System.out.println("DD");
                break;
            case 4:
                System.out.println("Grade: DD");
                break;
            default:
                System.out.println("Fail");
        }
    }

}
