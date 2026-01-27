package com.christyjohn.springboot.cruddemo.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class TaskErrorResponse {

    @NonNull
    private int status;

    @NonNull
    private String message;

    @NonNull
    private Long timestamp;
}
