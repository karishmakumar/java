package com.linearsearch;

public class minandmax {
    public static void main(String[] args) {

        int[] arr = {18, 12, -7, 3, 0, 9};

        int min = 18;
        int i;

        for( i = 1; i < arr.length-1;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }


}
