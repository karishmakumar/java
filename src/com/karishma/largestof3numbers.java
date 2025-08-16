package com.karishma;


import static java.lang.Math.max;

public class largestof3numbers {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();

//        //write one way
//        int max = a ;
//
//        if (max < b) max = b ;
//        else if ( max < c ) max = c;
//
//        System.out.println(max);


// write 2nd way - damn

        System.out.println(max(90,(max(70,10))));

//        if ( a > b && a > c ) {
//                System.out.println(" a is greatest");
//        }
//        else if( b > a && b > c) // a is less then b so that means b is greater then a
//        {
//            System.out.println(" B is greatest");
//        }
//        else
//        {
//            System.out.println(" C is greatest");
//        }


    }
}
