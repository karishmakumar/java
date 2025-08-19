package com.arrays;

public class RichestCustomerWealth {

    /*Input: accounts = [[1,5],[7,3],[3,5]]
    Output: 10
    Explanation:
    1st customer has wealth = 6
    2nd customer has wealth = 10
    3rd customer has wealth = 8
    The 2nd customer is the richest with a wealth of 10.*/

    public static void main(String[] args) {
        int[][] accounts = {{100,5},{5,3},{3,7}};
        int sum = 0 ;
        int[] result = new int[3];

        for( int i = 0 ; i <= (accounts.length) - 1 ;i++)
        {
            for( int j = 0 ; j<=(accounts[i].length)-1;j++)
            {
                sum = sum+ accounts[i][j]   ;
            }
            System.out.println( (i+1) + " customer has wealth " + sum);
            result[i]=sum;
            sum = 0 ;
            }
        checkmax(result);
        }


    private static void checkmax(int[] result) {
        // assuming result[0]  = max
        int max = result[0];
        int i;
        for (i = 1; i <= (result.length) - 1; i++) {
            if (result[i] > max) max = result[i];
        }
        System.out.println (" customer is richest with the max wealth is " + max);
    }

}
