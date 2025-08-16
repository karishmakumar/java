package com.karishma;

import java.util.Scanner;

public class HDFLCM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();

        int a = num1;
        int b = num2;
       // int c = 0;

        while( b != 0)
        {
            int c = a % b ;
            a = b;
            b = c;

        }

        int lcm = (num1*num2)/a;

        System.out.println("HCF of input numbers: "+ a);
        System.out.println("LCM of input numbers: "+lcm);


    }
}
