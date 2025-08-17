package com.karishma;
import java.util.Scanner;

public class valueoperators {
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner number1 = new Scanner(System.in);
        int A = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        int B = number2.nextInt();

        Scanner op = new Scanner(System.in);
        String operator = op.next();

        switch (operator) {
            case "+" -> System.out.println(A + B);
            case "-" -> System.out.println(A - B);
            case "*" -> System.out.println(A * B);
            case "/" -> System.out.println(A / B);
            case null, default -> System.out.println(" not a number / operator ");
        }
    }

}
