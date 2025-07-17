package com.karishma;

import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {
        //To find Armstrong Number between two given number.
        // 1^3 + 5^3 + ^33 = 1 + 125 + 27 = 153.
        int result=0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int original = num ;

        while ( num != 0 )
        {
           int a = num % 10;
            num = num /10;
            result = result + (int)(Math.pow(a, 3));
        }

        System.out.println(original);
        if ( result == original ) System.out.println(" armstrong");
                else System.out.println(" not armstrong");

    }
}
