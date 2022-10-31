package com.ex.search;

public class SimpleSearch {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(recrsive(intArray, 1));
    }

    private static int simpleBinary(int[] intArray, int value) {

        int start = 0;
        int end = intArray.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (intArray[mid] == value) {
                return mid;
            } else if (intArray[mid] > value) {
                end = mid;

            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int recrsive(int[] input, int value) {
        return recrsiveBinarry(input, 0, input.length, value);
    }

    private static int recrsiveBinarry(int[] input, int start, int end, int value) {

        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        System.out.println("mid =" + mid + " and it value " + input[mid]);
        if (input[mid] == value) {
            return mid;
        } else if (input[mid] < value) {
            return recrsiveBinarry(input, mid + 1, end, value);
        } else {
            return recrsiveBinarry(input, start, mid, value);

        }
    }


}
