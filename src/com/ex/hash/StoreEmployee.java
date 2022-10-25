package com.ex.hash;

import com.ex.Employee;

public class StoreEmployee {
    private String key;
    private Employee employee ;

    public StoreEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    public String getKey() {
        return key;
    }

    public Employee getEmployee() {
        return employee;
    }
}
