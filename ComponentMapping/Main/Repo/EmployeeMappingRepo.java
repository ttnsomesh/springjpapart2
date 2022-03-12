package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeMappingRepo extends CrudRepository<Employee,Integer> {
}
