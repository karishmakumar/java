package com.karishma;

import java.util.Scanner;

public class greetingmsg {
    public static void main(String[] args) {
        //2.Take name as input and print a greeting message for that particular name.
        Scanner name = new Scanner(System.in);
        String character = name.next();
        System.out.println(character + " you are good at this .");

    }
}
