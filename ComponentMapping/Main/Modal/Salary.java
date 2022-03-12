package com.example.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Salary {

    private Double basicsalary;


    private Double bonussalary;


    private Double taxamount;


    private Double specialallowancesalary;

    public Double getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Double basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Double getBonussalary() {
        return bonussalary;
    }

    public void setBonussalary(Double bonussalary) {
        this.bonussalary = bonussalary;
    }

    public Double getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(Double taxamount) {
        this.taxamount = taxamount;
    }

    public Double getSpecialallowancesalary() {
        return specialallowancesalary;
    }

    public void setSpecialallowancesalary(Double specialallowancesalary) {
        this.specialallowancesalary = specialallowancesalary;
    }
}
