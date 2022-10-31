package com.ex.sort.mega;

public class SimpleMerge {
    public static void main(String[] args) {

        int [] arr = {20,35,-15,7,55,1,-22};

        mergeSort(arr,0, arr.length);


        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    //{20,35,-15,7,55,1,-22}
    public static void mergeSort(int []input, int starIndex,int endIndex){
        // we need a breaking condition[this mean we have one element array
        if(endIndex - starIndex < 2){
            return;
        }

        // for the first time we will get the full array,next we will get the left half of the array

        int mid = (starIndex + endIndex ) / 2;

        // we create left and right array
        mergeSort(input,starIndex,mid); // left

        // when this called we have same input , start was 0 , end was 3 , mid was 1[first call]
        mergeSort(input,mid,endIndex); // right

        //
        merge(input,starIndex,mid,endIndex); // merge


    }

    //{20,35,-15,7,55,1,-22}
    private static void merge(int[] input, int start, int mid, int end) {

        // there is no merge to do, we are done
        //we know that mid is the first element on the right side,
        // and it's one greater than the last element on the left side
        //so mid - 1 is the last element on the left side, input mid is the first element in the right position

        if(input[mid - 1] <= input[mid]){
            return; // optimisation  7 and 55 are both in the right position
        }

        int i = start;
        int j = mid ;
        int tempIndex = 0;

        int []tempArr = new int[end - start]; // 7 - 0 will be 7

        while (i < mid && j < end){

            tempArr[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // this will handle the remaining element from left

        // {32 , 34 } , {33 , 36}
        //{32,33,34} we did not handle 36 as we are going to copy tempArr that  {},{} currently occupy

        System.arraycopy(input,i,input,start + tempIndex,mid - i); // mid - i this tell us the length that we did not get in the left array
        System.arraycopy(tempArr,0,input,start,tempIndex);



    }


}
