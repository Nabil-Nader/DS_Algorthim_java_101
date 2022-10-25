package com.ex.hash;

import com.ex.Employee;

import java.util.LinkedList;

public class ChainHashTable {

    private LinkedList<StoreEmployee> [] hashTable;

    public ChainHashTable(){
        hashTable = new LinkedList[10];
        // remove this later to see what is happening
        for( int i = 0 ; i < hashTable.length ; i++){
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put (String key , Employee employee){
        int hashKEy = hashKey(key);
        //this will require more memory
        hashTable[hashKEy].add(new StoreEmployee(key,employee));
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }
}
