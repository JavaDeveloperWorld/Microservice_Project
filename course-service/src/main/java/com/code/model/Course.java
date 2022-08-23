package com.code.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "course_name")
    private String course_name;
    @Column(name = "course_price")
    private float course_price;
}
