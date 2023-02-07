package com.ex.zeromaster.staticf;

public class StaticEmployee {

    private static int  counter;
    private int id;
    {
        counter++;
    }
    public StaticEmployee(){
        if(counter>1){
            throw new RuntimeException("can not create an instance of type Employee");
        }
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        StaticEmployee.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
