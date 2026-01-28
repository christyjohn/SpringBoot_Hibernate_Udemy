package com.christyjohn.springboot.springmvc.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
}
