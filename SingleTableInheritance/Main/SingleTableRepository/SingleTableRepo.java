package com.example.demo.SingleTableRepository;

import com.example.demo.SingleTableModel.Payment;
import org.springframework.data.repository.CrudRepository;

public interface SingleTableRepo extends CrudRepository<Payment , Integer> {
}
