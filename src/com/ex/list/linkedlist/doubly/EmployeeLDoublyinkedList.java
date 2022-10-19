package com.ex.list.linkedlist.doubly;

import com.ex.list.array.Employee;

public class EmployeeLDoublyinkedList {

    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);

        //when we add a node to the front of the list,it is going to become the first node in the list.
        // and so its previous field will always point to null,so we don't have to handle the previous field,
        // but we're going to have to change the previous field of the node that's currently at the head of the list
        //because the previous field of the current head node , will have to point to the node that we're adding

        node.setNext(head);

        //when we are adding a node to empty list we need to set the tail to the node
        if (head == null){
            tail = node;
        }else{
            head.setPrevious(node);
            node.setNext(head);
        }


        head = node;
        size++;

    }

    public void addToEnd(Employee employee){
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        if(tail == null){
            head = node;
        }else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node ;
        size++;

    }

    public EmployeeDoublyNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }
        EmployeeDoublyNode removeNode = tail;

        if(tail.getPrevious() == null){
           //if this was get Next tail.getNext() will always be null
            head = null;
        }else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        removeNode.setPrevious(null);
        size--;

        return removeNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printNode() {
        EmployeeDoublyNode current = head;
        System.out.print("This is the Head ->");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public EmployeeDoublyNode removeFromFirnt() {
        if (isEmpty()) {
            return null;
        } else {
            EmployeeDoublyNode removeNode = head;
            head = head.getNext();
            removeNode.setNext(null);
            size--;
            return removeNode;
        }
    }

}
