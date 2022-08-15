package com.example.springbootmultitenanthibernate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PersonDto {
    private Long id;
    private String name;
    private String tenant;
}
