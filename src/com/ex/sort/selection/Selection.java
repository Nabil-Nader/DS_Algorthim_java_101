package com.ex.sort.selection;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {



    int [] intArray = {20,35,-15,7,55,1,-22};

        for(int lastUnsortedIndex = intArray.length -1 ; lastUnsortedIndex> 0; lastUnsortedIndex-- ){

            int largest = 0;

            for(int i = 1 ; i <= lastUnsortedIndex ; i++){

            if(intArray[i] > intArray[largest]) {
                largest = i;
            }
        }
            swap(intArray, largest,lastUnsortedIndex);

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

