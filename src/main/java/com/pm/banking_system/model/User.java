package com.pm.banking_system.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AccountNumber;

    @NotNull
    private String FirstName;
    @NotNull
    private String LastName;

    @NotNull
    @Length(min = 6)
    private String Address;



}
