package com.akshay.employeejpademo;

import com.akshay.employeejpademo.model.Employee;
import com.akshay.employeejpademo.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Week 2 - Spring Data JPA, Exercise 2.
 * CRUD operations on an Employee entity.
 */
@SpringBootApplication
public class EmployeeJpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeJpaDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeService employeeService) {
        return args -> {
            System.out.println("\n--- employee-jpa-demo Demo (Employee CRUD) ---");

            employeeService.addEmployee(new Employee("Akshay", "Engineering", 65000, "akshay@example.com"));
            employeeService.addEmployee(new Employee("Priya", "HR", 55000, "priya@example.com"));
            employeeService.addEmployee(new Employee("Ravi", "Engineering", 72000, "ravi@example.com"));

            System.out.println("All employees:");
            employeeService.getAllEmployees().forEach(System.out::println);

            System.out.println("\nEngineering department:");
            employeeService.getEmployeesByDepartment("Engineering").forEach(System.out::println);

            System.out.println("\nEmployees earning more than 60000:");
            employeeService.getEmployeesEarningMoreThan(60000).forEach(System.out::println);

            Employee akshay = employeeService.getAllEmployees().get(0);
            akshay.setSalary(70000);
            employeeService.updateEmployee(akshay.getId(), akshay);

            System.out.println("\nAfter giving Akshay a raise:");
            System.out.println(employeeService.getEmployeeById(akshay.getId()).orElse(null));
        };
    }
}
