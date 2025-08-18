package com.conditionsandloops;

import java.util.Scanner;

public class vowelorconsonant {
    public static void main(String[] args) {
        // Java Program Vowel Or Consonant
        Scanner in = new Scanner(System.in);
        char input = in.next().charAt(0);

        switch (input){
            case 'a', 'e', 'i', 'o', 'u': System.out.println("vowels");break;
            default:
                System.out.println(" consonant");

        }
    }
}
