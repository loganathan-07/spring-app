
package com.example;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private int employeeId = 102;
    private String employeeName = "Kumaran";
    private double salary = 50000.0;

    public void addEmployee() {
        System.out.println("Employee added: " + employeeName);
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

    public void calculateSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}
