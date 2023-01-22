package com.ex.fp.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alex","Billy","Doctor");

        //forEach take a consumers → we will discuss this later
        Consumer<String> stringConsumer = System.out::println;
//        names.forEach(stringConsumer);
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);

        // next let extract input lambda as a variable
        

    }
}
