package com.ex.sort.recursion;

import java.math.BigDecimal;

public class Recursion {

    public static void main(String[] args) {

        // 1! = 1 * 0! = 1
        //2! = 2 * 1 = > 2 * 1!
        // 3! = 3 * 2 * 1 = 3 * 2!
        // 4! = 4 * 3 * 2 * 1 = 4 *3!

//        System.out.println(iteratorFactorial(2));
//        System.out.println(iteratorFactorial(3));
//        System.out.println(iteratorFactorial(4));
        System.out.println(iteratorFactorial(50));

        System.out.println(recursiveFactorial(BigDecimal.valueOf(10000)));
//        System.out.println(recursiveFactorial(3));
//        System.out.println(recursiveFactorial(4));
//        System.out.println(recursiveFactorial(5));
    }

    public static long iteratorFactorial(int num){
        if (num == 0) {
            return 1;
        }
        long factorial = 1;
        for(int i = 1 ; i <= num ; i++){
            factorial *=i ;


        }
        return factorial;
    }
    // n! = n *  (n-1)!
    public static BigDecimal recursiveFactorial(BigDecimal num){
        int comp = num.compareTo(BigDecimal.valueOf(0));
        if(comp == 0){
            return BigDecimal.valueOf(1);
        }

        return num .multiply(recursiveFactorial(num.subtract(BigDecimal.valueOf(1))));
    }
}
