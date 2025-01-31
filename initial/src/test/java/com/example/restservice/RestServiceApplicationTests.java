package com.example.restservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RestServiceApplicationTests {

	@Mock
	private EmployeeManager employeeManager;

	int getEmployeeCount(EmployeeManager manager) {
		return manager.getAllEmployees().getEmployeeList().size();
	}

	@Test
	void createEmployeeManager() {
		employeeManager = new EmployeeManager();

		assert(getEmployeeCount(employeeManager) != 0);
	}

	@Test
	void addEmployee() {
		employeeManager = new EmployeeManager();
		int employeeCount = getEmployeeCount(employeeManager);
		Employee employee = new Employee(1, "Killer", "Bean", "killerbean@gmail.com", "CEO");
		employeeManager.addEmployee(employee);
		assert(employeeCount + 1 == getEmployeeCount(employeeManager));
	}


	@ExtendWith(MockitoExtension.class)
	@BeforeEach
	void setUp()
	{
		this.employeeManager = new EmployeeManager();
		Employee newEmployee = new Employee(1, "Killer", "Bean", "killerbean@gmail.com", "CEO");
		this.employeeManager.addEmployee(newEmployee);
	}

	@Test
		// Check whether added employee ID is found in ID field
	void employeeIdInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getId() == 1)
			{
				return;
			}
		}
		assert(false);
	}

	@Test
		// Check whether added employee first name is found in first name field
	void employeeFirstNameInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getFirstName() == "Killer")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
		// Check whether added employee last name is found in last name field
	void employeeLastNameInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getLastName() == "Bean")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
		// Check whether added employee email is found in email field
	void employeeEmailInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmail() == "killerbean@gmail.com")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
		// Check whether added employee title is found in title field
	void employeeTitleInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getTitle() == "CEO")
			{
				return;
			}
		}
		assert(false);
	}
}
