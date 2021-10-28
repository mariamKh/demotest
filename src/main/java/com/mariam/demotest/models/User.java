package com.mariam.demotest.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String position;

    @ManyToOne
    private EnneagramType enneagramType;
}
