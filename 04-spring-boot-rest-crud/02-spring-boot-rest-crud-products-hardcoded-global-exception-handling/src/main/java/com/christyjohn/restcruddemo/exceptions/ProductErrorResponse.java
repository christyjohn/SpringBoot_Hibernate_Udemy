package com.christyjohn.restcruddemo.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class ProductErrorResponse {

    @NonNull
    private int status;

    @NonNull
    private String message;

    @NonNull
    private long timestamp;
}
