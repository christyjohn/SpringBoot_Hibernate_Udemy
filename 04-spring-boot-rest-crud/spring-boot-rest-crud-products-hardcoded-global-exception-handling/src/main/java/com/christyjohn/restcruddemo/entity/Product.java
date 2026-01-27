package com.christyjohn.restcruddemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Product {
    @NonNull
    private String productName;

    @NonNull
    private String sku;

    @NonNull
    private double price;

    @NonNull
    private String productDescription;
}
