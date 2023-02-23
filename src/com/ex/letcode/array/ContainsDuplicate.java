package com.ex.letcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (Integer num : nums){
            if(!mySet.contains(num)){
                mySet.add(num);
            }else {
                return false;
            }
        }
        return true;

    }
}
