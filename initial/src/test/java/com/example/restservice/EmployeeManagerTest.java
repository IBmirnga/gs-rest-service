package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class EmployeeManagerTest {

    @InjectMocks
    private EmployeeManager employeeManager;

    @Mock
    private Employees employees;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldGetAllEmployees() {

        //when

    }

}
