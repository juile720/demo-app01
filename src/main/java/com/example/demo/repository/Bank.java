package com.example.demo.repository;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class Bank {

    private @Id @GeneratedValue Long id;
    private String bankName;
    private String bankType;
    private String description;
    private int regUser;
    private Timestamp regDate;

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Bank))
            return false;
        Bank employee = (Bank) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.bankName, employee.bankName);
    }

}