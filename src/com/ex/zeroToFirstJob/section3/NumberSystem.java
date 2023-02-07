package com.ex.zeroToFirstJob.section3;

import java.util.Arrays;

public class NumberSystem {
    public static void main(String[] args) {
        int hex= 0xacdc;
        System.out.println(hex);
        Long i = 127L;
        Long i2 = 127L;
        System.out.println(i==i2);
        String x = "he ll o";
        System.out.println(Arrays.toString(x.split(" ")));
        localVariable();
    }

    public static void localVariable(){
        Integer i = null;
        System.out.println("here is a simple undefine a local variable "+ i);
    }
}
