package com.ex.jv;

public class PassBy {
    public static void main(String[] args) {

        Integer x = 1;
        Integer y = 2 ;
        swap(1,2);
        System.out.println("x = "+x +"y = "+y);
    }

    public static void swap(Integer x , Integer y){
        Integer temp = x;
        x = y;
        y=temp;
    }
}
