package com.karishma;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
       // To find out whether the given String is Palindrome or not. abba.(original.length()-1)/2


        Scanner in = new Scanner(System.in);
        String original;
        original = in.next();

        for (int i = 0; i<= (original.length()/2); i++ ) {
                if (original.charAt(i) == original.charAt((original.length()-1-i))) {
                    System.out.println("Is a palindrome");
                }
                else
            {
                System.out.println("not a Palindrome");
            }
            }
    }
}

