package com.chlebek.springrestapp.repository;

import com.chlebek.springrestapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
