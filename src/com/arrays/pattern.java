package com.arrays;

public class pattern {

    public static void main(String[] args) {
        int n = 5;

//pattern 3
    // n and row can be used to write col.
        for( int row = 1 ; row <= n; row++){
            for(int col = 0 ; col <= n-row;col++){
                System.out.print("* ");
                }
            // when one row is printed we need to add new line .
            System.out.println();
            }

        //pattern 4
        for( int row = 1 ; row <= n; row++){
            for(int col = 1 ; col <= row;col++){
                System.out.print(col+" ");
            }
            // when one row is printed we need to add new line .
            System.out.println();
        }

        //pattern 5

        }
}


/*
*****
****
***
**
*
*/

