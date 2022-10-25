package com.ex.hash;

import com.ex.Employee;

public class MyHashTable {

    private Employee [] hashTable;

    public MyHashTable (){
        hashTable = new Employee[10];
    }

    //hashing function , we are going to use employee last name as key
    private int hashKey(String key){
        // joanse => 5 % 10 => 5
        System.out.println("Hash Key vlaue for :"+key +" is :" +key.length() % hashTable.length);
        return key.length() % hashTable.length;
    }

    // add function

    public void put(Employee employee,String key){

        int hashKey = hashKey(key);

    }
}
