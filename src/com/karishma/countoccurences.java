package com.karishma;

public class countoccurences {
    public static void main(String[] args) {
        int num = 1556,count=0;

        while(num > 0)
        {
            int remain = num % 10;
            if(remain == 5) count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
