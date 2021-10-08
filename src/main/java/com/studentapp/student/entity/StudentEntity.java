package com.studentapp.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int rollNo;
}
