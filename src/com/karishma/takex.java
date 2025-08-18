package com.karishma;
import java.util.Scanner;

public class takex {
    public static void main(String[] args) {
        //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        int sum = 0 ;
        Scanner number = new Scanner(System.in);
        while(true) {
            String op = number.next();
            if (op.equals("x")) break;
            else {
                sum = sum+ Integer.parseInt(op);
            }
        }
        System.out.println(sum);

    }
}
