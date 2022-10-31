package com.ex.sort.count;

public class SimpleCount {
    public static void main(String[] args) {

        int [] arr = {2,5,9,8,2,8,7,10,4,3};


        countingSort(arr,2,10);
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
//input=[2, 5, 9, 8, 2, 8, 7, 10, 4, 3]
    public static void countingSort(int[]input,int min, int max){

        int []countArray = new int[(max - min) +1 ] ;

        //[0, 2, 1, 1, 1, 0, 1, 2, 1, 1]
        for(int i = 0 ; i <input.length;i++){
            countArray[input[i] - min]++;
        }
        // once we finish counting we need to figure out how to sort the array

        int j = 0; // j is the index we are going to use to write input array
        for(int i = min ; i <= max; i++){
            while (countArray[i- min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }


    }
}
