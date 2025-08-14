package com.karishma;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char first = in.next().trim().charAt(0);
        String caseA = Checkcase(first);
        System.out.println(caseA);
    }

    private static String Checkcase(char first) {

        if ( first >= 'a' && first <= 'z')
            return("lowercase");
        else
            return("uppercase");

    }

}

