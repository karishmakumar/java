package com.karishma;
import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
      //  3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner principle = new Scanner ( System.in);
        int P = principle.nextInt();

        Scanner Time = new Scanner ( System.in);
        int T = Time.nextInt();

        Scanner Rate = new Scanner ( System.in);
        int R = Rate.nextInt();

        System.out.println("Simple Interest =" + (P*T*R)/100);
    }
}
