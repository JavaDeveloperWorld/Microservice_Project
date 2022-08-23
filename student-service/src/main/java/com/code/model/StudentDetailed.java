package com.code.model;

import lombok.Data;

@Data
public class StudentDetailed {
    private int id;
    private String name;
    private String surname;
    private byte age;
    private Course course;
}
