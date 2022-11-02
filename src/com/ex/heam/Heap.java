package com.ex.heam;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        this.heap = new int[capacity];
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");

        }

        // we will put the value in the next available position
        heap[size] = value;
        fixHeapAbove(size);
        size++;


        //we need to fix the heap -> heapify


    }


    public void fixHeapAbove(int index) {
        int newValue = heap[index];

        // index hit the root
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

}
