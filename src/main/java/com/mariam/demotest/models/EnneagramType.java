package com.mariam.demotest.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class EnneagramType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int index;
    private String name;
}
