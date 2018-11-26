package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @Min(1)
    private int age;

}
