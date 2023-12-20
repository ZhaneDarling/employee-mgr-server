package com.codedifferently.employeemgrserver.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity//JPA TO SAVE TO THE DATABASE
@NoArgsConstructor// NON ARGUMENT CONSTRUCTOR
@RequiredArgsConstructor// PARAMETERIZED CONSTRUCTOR
@Data// GETTERS & SETTERS
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private  String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String email;
    public  String toString(){
        return String.format("%d %s %s %s", id, firstName, lastName,email);
    }


}
