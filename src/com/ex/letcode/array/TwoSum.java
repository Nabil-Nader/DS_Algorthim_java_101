package com.ex.letcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    /*
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

     */
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15}; //Output: [0,1]

        System.out.println(Arrays.toString(twoSum(arr, 9)));


    }

    public static int[] twoSum(int[] nums, int target) {
        // create a hashmap to store index for sum amount
        HashMap<Integer, Integer> value = new HashMap<>();
        List<Integer> twoSums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            value.put(target - nums[i], i);
        }
        for (Integer number : nums) {
            if (value.containsKey(number)) {
                twoSums.add(value.get(number));
            }
        }

        int [] arr = new int[twoSums.size()];
        for(int i = 0 ; i<twoSums.size(); i++){
            arr[i] = twoSums.get(i);
        }
        return arr;


    }
}
