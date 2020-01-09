package com.iktex.productapi.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long category_id;
    @Column(length = 64)
    private String name;
    @Column(precision = 4)
    private double price;
}
