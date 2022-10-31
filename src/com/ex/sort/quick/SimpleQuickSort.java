package com.ex.sort.quick;

public class SimpleQuickSort {
    public static void main(String[] args) {

        int [] arr = {20,35,-15,7,55,1,-22};

        quickSort(arr,0, arr.length);


        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void quickSort(int [] input, int start , int end){
        if(end - start < 2){
            return;
        }

        //find the pivot
        int pivotIndex = partition(input,start,end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex + 1 , end);



    }

    private static int partition(int[] input, int start, int end) {

        // this is using the first element as pivot
        int pivot = input[start];
        int i = start; //=> i is going to travers from left to right
        int j = end; //=> j right to left

        // we will stop when I and J cross each other

        while (i < j){
            //NOTE: empty body
            while (i < j && input[--j] >= pivot);
            // we check
            if( i <j){
                input[i] = input[j];
            }
            // NOTE empty loop
            while (i < j && input[++i] <= pivot);

            if( i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j; // we return the index that we saved the pivot


    }
}
