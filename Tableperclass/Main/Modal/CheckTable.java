package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "checkdetail")
public class CheckTable extends Payment{
    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }
}
