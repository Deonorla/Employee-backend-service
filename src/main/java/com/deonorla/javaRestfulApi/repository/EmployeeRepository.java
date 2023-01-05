package com.deonorla.javaRestfulApi.repository;

import com.deonorla.javaRestfulApi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
