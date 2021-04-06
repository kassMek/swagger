package com.kass.swaggerdemo.repository;

import com.kass.swaggerdemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
