package com.ex.jv;

import com.ex.letcode.TestStatic;

public class PassBy {
    public static void main(String[] args) {

        Integer x = 1;
        Integer y = 2 ;
        swap(1,2);
        System.out.println("x = "+x +"y = "+y);
        System.out.println(TestStatic.number);
    }

    public static void swap(Integer x , Integer y){
        Integer temp = x;
        x = y;
        y=temp;
    }
}
