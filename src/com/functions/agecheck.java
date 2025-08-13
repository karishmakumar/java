package com.functions;

import java.util.Scanner;

public class agecheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( AgeCheck(in.nextInt()));
    }

    private static String AgeCheck(int inputAge) {
        if (inputAge >= 18)
                return("legal");
        else
                return(" not legal");
    }
}
