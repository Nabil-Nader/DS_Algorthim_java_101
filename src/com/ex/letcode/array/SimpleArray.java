package com.ex.letcode.array;

import java.util.HashMap;
import java.util.Objects;

public class SimpleArray {

    public static void main(String[] args) {
//        System.out.println(isAnagramV3("anagram", "nagaram"));
        int[] x = {1, 1, 1, 2, 2, 3};
        int[] x2 = {1};
        int[] x3 = {-1, -1};
        int[] x4 = {1, 2};
        int[] x5 = {4, 1, -1, 2, -1, 2, 3};
        ;

        System.out.println(topKFrequent(x5, 2));
    }

    public static boolean isAnagram(String s, String t) {

        byte sByte[] = s.getBytes();
        byte tByte[] = t.getBytes();
        if (s.length() != t.length()) return false;

        for (int i = 0, j = t.length() - 1; i < s.length() / 2; i++, j--) {
            if (sByte[i] != tByte[j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramV2(String s, String t) {

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> dMap = new HashMap<>();
        s = s.toLowerCase();
        t = t.toLowerCase();
        if (s.length() != t.length()) return false;


        for (int i = 0; i < s.length(); i++) {

            Integer countS = sMap.get(s.charAt(i));
            Integer countD = dMap.get(t.charAt(i));

            sMap.put(s.charAt(i), countS == null ? 1 : sMap.get(s.charAt(i)) + 1);
            dMap.put(t.charAt(i), countD == null ? 1 : dMap.get(t.charAt(i)) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            Integer countS = sMap.get(s.charAt(i));
            Integer countD = dMap.get(t.charAt(i));
            if (!Objects.equals(countS, countD) || countS == null) return false;
        }

        return true;


    }

    public static boolean isAnagramV3(String s, String t) {
        if (s.length() != t.length()) return false;

        // as we only have 26 letter
        int[] countChar = new int[26];

        // this will put the letter in the right position
        //[1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] when i =1
        for (int i = 0; i < s.length(); i++) {
            countChar[s.charAt(i) - 'a']++;
            countChar[t.charAt(i) - 'a']--;
        }

        for (int count : countChar) {
            if (count != 0) return false;
        }

        return true;
    }


    public static int[] topKFrequent(int[] nums, int k) {

        int[] newAeeay = new int[k];
        int postion = 0;
        if (k == nums.length) {
            newAeeay[0] = k;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            Integer countS = map.get(i);
            map.put(i, countS == null ? 1 : map.get(i) + 1);
        }

        for (int i : map.keySet()) {
            Integer number = map.get(i);
            if (number >= 1 && postion < k) {

                newAeeay[postion] = i;
                postion++;
            }

        }
        return newAeeay;

    }

}
