package com.arrays;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {

       // int[] num = {1,2,3,4,5};
      //  String[] num = {"karishma","kashu","kandy","kook"};
        char[] num = {'K','a','r','i'};
        char temp ;

        for (int i = 0, j = num.length - 1; i <= num.length/2 && j >= (num.length/2)-1; i++, j--) {
            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
        System.out.println(Arrays.toString(num));
    }
}
