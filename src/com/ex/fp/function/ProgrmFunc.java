package com.ex.fp.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ProgrmFunc {
    public static void main(String[] args) {

        System.out.println(incrementByOne(1));
        Function<Integer, Integer> combinedFunction = incrementByOneFunction
                .andThen(doubleFunction);
        System.out.println(combinedFunction.apply(1));

       Person billy =  personMapper.apply("BIlly", 28);
        System.out.println(billy.toString());
    }



    public static Function<Integer, Integer> doubleFunction =
            n -> n * 2;

    // pre function programming -> okay who to change this to use FP
    public static int incrementByOne(int n) {
        return n + 1;
    }

    // the first type is the argument , and outPut -> they are both int
    public static Function<Integer, Integer> incrementByOneFunction = num -> num + 1;



    static class Person {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static Person person(String name,int age){
        return new Person(name,age);
    }

    static BiFunction<String, Integer, Person> personMapper =

//            (name, age) -> new Person(name, age);
            Person::new;



}


