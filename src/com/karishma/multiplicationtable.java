package com.karishma;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multi = input.nextInt();

        for(int i= 1 ; i<= 10 ;i++) {
            System.out.println("multiplication table of " + multi +"*" +i+ "=" + (multi * i));
        }

    }
}
