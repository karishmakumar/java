package com.functions;
import java.util.Scanner;


//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class maxndmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1  = in.nextInt();
        int num2 =  in.nextInt();
        int num3 =  in.nextInt();
        System.out.println(" the max number is " + maximumnum(num1,num2,num3));
        System.out.println(" the min number is "+ minimumnum(num1,num2,num3));
    }

    private  static int maximumnum(int a, int b, int c) {

        // assume a is the greatest.
        int greatest = a ;
        if ( b > greatest  ) {
            greatest = b ;
        }
        if( c > greatest )
        {
            greatest = c;
        }
        return greatest;
    }

    private static int minimumnum(int a, int b, int c) {
        int minimum = a ;
        if ( b < minimum  ) {
            minimum = b ;
        }
        if( c < minimum )
        {
            minimum = c;
        }
        return minimum;
    }

}


// a is the greatest  4
// b > greatest => greatest = b 3>4 3 = greatest = 4
// c > greatest => greatest = c  5> 4 = greatest = 5
