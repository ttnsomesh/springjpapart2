package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "carddetail")
public class CardTable extends Payment{
    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
