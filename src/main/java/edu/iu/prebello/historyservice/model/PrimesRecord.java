package edu.iu.hmbharad.historyservice.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PrimesRecord {

    @Id
    @GeneratedValue
    private int id;

    private String customer;

    private String n;

    private boolean isPrime;

    public int getId() {
        return id;
    }

    // Additional getters and setters would go here
}

