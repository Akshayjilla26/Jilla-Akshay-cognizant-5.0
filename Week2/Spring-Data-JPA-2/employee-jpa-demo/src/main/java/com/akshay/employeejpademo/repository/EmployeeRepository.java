package com.akshay.employeejpademo.repository;

import com.akshay.employeejpademo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartment(String department);

    Employee findByEmail(String email);

    List<Employee> findBySalaryGreaterThan(double salary);
}
