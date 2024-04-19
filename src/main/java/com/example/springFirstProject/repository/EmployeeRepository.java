package com.example.springFirstProject.repository;

import com.example.springFirstProject.entity.Department;
import com.example.springFirstProject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
