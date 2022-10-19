package com.ex.sort.buble;

import java.util.Arrays;

public class MyBubleSort {
    public static void main(String[] args) {

        int [] intArray = {20,35,-15,7,55,1,-22};

        for(int lastUnsortedIndex = intArray.length -1 ; lastUnsortedIndex> 0; lastUnsortedIndex-- ){

            for(int i = 0 ; i < lastUnsortedIndex ; i++){
                if(intArray[i] > intArray[i+1]) {
                    swap(intArray, i,i+1);
                }
            }
        }

        System.out.println(Arrays.toString(intArray));
    }



    public static void swap(int []array ,int smallNumber , int bigIndexNumber){
        if(smallNumber == bigIndexNumber){
            return;
        }else {
            int temp = array[smallNumber];
            array[smallNumber] = array[bigIndexNumber];
            array[bigIndexNumber] = temp;
        }
    }
}
