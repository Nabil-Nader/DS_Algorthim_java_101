package com.ex.sort.radix;

public class SimpleRadix {

    public static void main(String[] args) {


        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray,10,4);
        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

    public static void radixSort(int[] input, int radix, int width) {

        for (int i = 0; i < width; i++) {
            radisSingleSort(input, i, radix);
        }
    }

    private static void radisSingleSort(int[] input, int postion, int radix) {
        int numberItem = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(postion, value, radix)]++;
        }

        //  adjust the count
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        //copy the array
        int[] temp = new int[numberItem];
        for (int temIndex = numberItem - 1; temIndex >= 0; temIndex--) {
            temp[--countArray[getDigit(postion, input[temIndex], radix)]] = input[temIndex];


        }
        for (int tempIndex = 0; tempIndex < numberItem; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }


    }

    private static int getDigit(int postion, int value, int radix) {

        //4725 / 1 => 4725%10 => 5
        return value / (int) Math.pow(10, postion) % 10;
    }

}
