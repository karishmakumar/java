package com.functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int i = 2; i <= a; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }

    }
}
