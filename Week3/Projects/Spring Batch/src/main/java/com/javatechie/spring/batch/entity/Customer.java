package com.javatechie.spring.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  // This tells Hibernate to make a table out of this class --->  represents a database entit
@Table(name = "CUSTOMERS_INFO") // This tells Hibernate to make a table out of this class
@Data // Lombok's annotation to generate getters and setters, equals, hashCode, and toString methods.
@AllArgsConstructor //Generates a constructor with all fields as arguments.
@NoArgsConstructor // Generates a constructor with no arguments.
public class Customer {

    @Id //Specifies that the id field is the primary key of the entity
    @Column(name = "CUSTOMER_ID") //Specifies the name of the corresponding database column for each field.
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "CONTACT")
    private String contactNo;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;
    
}
