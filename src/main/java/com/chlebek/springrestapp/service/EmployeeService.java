package com.chlebek.springrestapp.service;

import com.chlebek.springrestapp.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> getEmployeeById(Long id);

    List<Employee> getEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(Long id);
}
