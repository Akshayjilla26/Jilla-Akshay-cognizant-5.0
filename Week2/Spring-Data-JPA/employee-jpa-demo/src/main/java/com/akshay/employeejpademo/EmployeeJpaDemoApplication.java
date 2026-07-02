package com.akshay.employeejpademo;

import com.akshay.employeejpademo.model.Employee;
import com.akshay.employeejpademo.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeJpaDemoApplication implements CommandLineRunner {

    private final EmployeeService employeeService;

    public EmployeeJpaDemoApplication(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeJpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        employeeService.addEmployee(new Employee("Akshay Jilla", "Engineering", 65000.0));
        employeeService.addEmployee(new Employee("Vishnu Varman", "Engineering", 70000.0));
        employeeService.addEmployee(new Employee("Priya Rao", "HR", 55000.0));

        System.out.println("\nAll employees:");
        employeeService.getAllEmployees().forEach(System.out::println);

        System.out.println("\nEngineering department employees:");
        employeeService.getEmployeesByDepartment("Engineering").forEach(System.out::println);

        System.out.println("\nEmployees earning above 60000:");
        employeeService.getEmployeesEarningAbove(60000.0).forEach(System.out::println);
    }
}
