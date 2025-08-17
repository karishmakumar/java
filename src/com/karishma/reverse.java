package com.karishma;

public class reverse {
    public static void main(String[] args) {
        int num = 5678, total = 0,remain;

        while(num > 0 ){
            remain = num % 10;

            num = num/10;

            total = total * 10 + remain ;

        }

        System.out.println(total);
    }
}
