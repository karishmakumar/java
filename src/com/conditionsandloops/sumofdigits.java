package com.conditionsandloops;

public class sumofdigits {
    public static void main(String[] args) {
        //Condition and loops - 23.Sum Of A Digits Of Number
        int num = 123,sum = 0;
        while( num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
