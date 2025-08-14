package com.functions;

import java.util.Scanner;

public class primenosrange {

    // Write a function that returns all prime numbers between two given numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (!(i % 2 == 0 || i % 3 == 0)) System.out.println(i);
            }
        }
    }