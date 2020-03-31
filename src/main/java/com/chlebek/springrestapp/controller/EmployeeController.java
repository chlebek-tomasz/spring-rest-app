package com.chlebek.springrestapp.controller;

import com.chlebek.springrestapp.model.Employee;
import com.chlebek.springrestapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    Optional<Employee> getEmployee(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/employees")
    List<Employee> getAll(){
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    void newEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }
}
