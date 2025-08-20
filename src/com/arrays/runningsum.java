package com.arrays;

import java.util.Arrays;

public class runningsum {
    public static void main(String[] args) {

        //Input: nums = [1,2,3,4]
        //Output: [1,3,6,10]
        //Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

        int[] nums  = {1,1,1,1,1};
        //{1, 2, 3, 4};

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        System.out.println("running sum is as follows" + Arrays.toString(nums));
    }
}

