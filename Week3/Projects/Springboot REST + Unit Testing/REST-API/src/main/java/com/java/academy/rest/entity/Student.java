package com.java.academy.rest.entity;

import jakarta.persistence.*;
import lombok.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private long id;

    @NotEmpty(message = "Field must not be empty")
    private String studentNumber;

    @NotEmpty(message = "Field must not be empty")
    private String name;

    @NotEmpty(message = "Field must not be empty")
    private String lastName;

    @NotNull (message = "Field must not be empty")
    @PositiveOrZero (message = "Average cannot be negative")
    private double average;


}