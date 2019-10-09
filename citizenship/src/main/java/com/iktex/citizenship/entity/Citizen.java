package com.iktex.citizenship.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private String name;
    @Column(length = 60)
    private String surName;
}
