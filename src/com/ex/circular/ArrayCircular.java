package com.ex.circular;

import com.ex.Employee;

import java.util.NoSuchElementException;

public class ArrayCircular {
    private Employee[] queue ;
    private int front;
    private int back;

    public ArrayCircular(int capacity) {
        queue= new Employee[capacity];


    }

    // adding an Element to the back of the queue, we will worry about size later
    // after adding the first item front will be 0,back will be 1
    public void add(Employee employee){

        //check to see if the queue is full -> back of queue will == array.length
        if(back== queue.length){
            Employee[]newArray = new Employee[2 * queue.length];

            System.arraycopy(queue, 0, newArray, 0, 2 *queue.length);
            queue = newArray;
        }
        queue[back] = employee;
        back++;
    }

    // now back is one, front is 0 -> 1 - 0 = 1 -> so we have one item on the queue
    //when we add we do not touch the front,when we remove we will increase the front back will still the same


    // keep in mind the back is always one position greater than the queue
    // [when we subtract front from back , this should give us the number of queue]
    public Employee remove(){

        if(size()==0) {
            throw  new NoSuchElementException();
        }
        Employee em  = queue[front];
        front++;

        //resetting to be empty queue
        if(size()==0){
            front=0;
            back=0;
        }
        return em;
    }

    public int size(){
        return back - front;
    }

    public Employee peel(){
        if(size()==0) {
            throw  new NoSuchElementException();
        }
      return queue[front];

    }


    public void printQueue(){
        for(int i = front ; i < back ; i ++){
            System.out.println(queue[i]);
        }
    }


}
