package com.ex.hash;

import com.ex.Employee;

public class SimpleHashTable {

    private Employee [] hashTable;

    public SimpleHashTable(){
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

        // this will give us the index so we can put it in the array
        int hashKey = hashKey(key);

        // we check to see if we already put employee in this position
        // we did not handel collation
        if(hashTable[hashKey] !=null){
            System.out.println("Sorry there are already an employee in this postion "+hashKey);
        }else {
            hashTable[hashKey] = employee;
        }


    }

    public Employee get(String key){
        int hashKey = hashKey(key);
        return hashTable[hashKey];

    }

    public void printHasTable(){
        for(int i = 0 ;  i < hashTable.length ;i++){
            System.out.println(hashTable[i]);
        }
    }
}
