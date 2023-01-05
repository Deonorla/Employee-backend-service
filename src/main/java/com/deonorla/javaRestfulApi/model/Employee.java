package com.deonorla.javaRestfulApi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // helps reduces getter, setters, and constructors boilerplate's codes.
@Entity // specifies that the class is an entity and is mapped to a database table.
@Table(name = "employees") // specifies the name of the database table to be used for mapping.
public class Employee {
    @Id //specifies the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY )// specifies the generation strategies for the values of primary keys
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false)
    private String email;
}
