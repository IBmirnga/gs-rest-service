package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EmployeesTest {

    private Employees employees;

    @BeforeEach
    void setUp() {
        employees = new Employees();
    }

    @Test
    public void shouldGetEmployeeList() {

        List<Employee> employeeList = new ArrayList<>();

    }
}