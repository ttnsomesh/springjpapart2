package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface JoinnedTableRepo extends CrudRepository<Payment , Integer> {
}
