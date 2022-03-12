package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface TablePerClassRepository extends CrudRepository<Payment , Integer> {
}
