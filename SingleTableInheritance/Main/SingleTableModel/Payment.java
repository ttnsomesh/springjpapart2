package com.example.demo.SingleTableModel;

import javax.persistence.*;

@Entity
@Table(name = "singletablepayment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pmode" , discriminatorType = DiscriminatorType.STRING)
public abstract class Payment {

    @Id
    private int id;
    private Double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
