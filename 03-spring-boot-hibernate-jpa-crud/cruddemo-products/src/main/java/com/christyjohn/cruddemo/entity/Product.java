package com.christyjohn.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="products")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NonNull
    @Column(name="product_name")
    private String productName;

    @NonNull
    @Column(name="sku")
    private String sku;

    @NonNull
    @Column(name="price")
    private double price;

    @NonNull
    @Column(name="product_description")
    private String productDescription;
}
