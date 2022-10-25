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
        if(size() == queue.length -1){
            int numItem = size();
            Employee[]newArray = new Employee[2 * queue.length];

            System.arraycopy(queue, front, newArray, 0,  queue.length - front);
            System.arraycopy(queue,0,newArray,queue.length - front,back);
            queue = newArray;
            front = 0;
            back = numItem;
        }
        // 0 - jane 2 front  back
        // 1 -   john 2-front
        // 2 -  back2 -front
        // 3 mike front
        // 4    bull

        //after we resize [front is set to be mick
        // 0 mick
        // 1 - bill
        // 2 jane
        // 3 john
        // back

        queue[back] = employee;
        if(back < queue.length - 1){
            back ++;
        }else{
            back=0;
        }
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
        } else if (front == queue.length){
            front=0;
        }
        return em;
    }

    public int size(){
        if( front <= back) {
            return back - front;
        }else {
            return back -front + queue.length;
        }
    }

    public Employee peek(){
        if(size()==0) {
            throw  new NoSuchElementException();
        }
      return queue[front];

    }


    public void printQueue(){
        if( front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            } for(int i = 0 ; i < back ; i++){
                System.out.println(queue[i]);
            }
        }
    }


}
