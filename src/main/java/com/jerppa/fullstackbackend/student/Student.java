package com.jerppa.fullstackbackend.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private Integer age;
   private LocalDate dob;
   private String email;

    public Student() {
    }

    public Student(Long id,
                   String name,
                   Integer age,
                   LocalDate dob,
                   String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public Student(String name,
                   Integer age,
                   LocalDate dob,
                   String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }
}
