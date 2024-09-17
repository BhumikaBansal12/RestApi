package com.example.demo.service;

import com.example.demo.Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    // Returns the list of employees; initializes the list if null
    public List<Employee> getEmployeeList() {
        if (employeeList == null) {
            employeeList = new ArrayList<>();
        }
        return employeeList;
    }

    // Setter for the employee list
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
