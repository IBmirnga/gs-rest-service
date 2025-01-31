package com.example.restservice;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {

    private static final Employees employees = new Employees();

    static {
        //Initialize with sample employee
        employees.getEmployeeList()
                .add(new Employee(1, "Killer", "Bean", "killerbean@gmail.com", "CEO"));
        employees.getEmployeeList()
                .add(new Employee(2, "John", "Doe", "johndoe@gmail.com", "CTO"));
        employees.getEmployeeList()
                .add(new Employee(3, "Jane", "Doe", "janedoe@gmail.com", "CFO"));
    }

    //Retrieve all employees
    public Employees getAllEmployees() {
        return employees;
    }

    //Add an employee
    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}
