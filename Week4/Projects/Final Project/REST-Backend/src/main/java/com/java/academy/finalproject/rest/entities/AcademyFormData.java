package com.java.academy.finalproject.rest.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "academyMember")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcademyFormData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Long phone;
    private String stateCity;
    private String githubUrl;
    private String career;
    private String role;
    private String roleOther;
    private String skills;
    private Integer englishLevel;
    private String otherLanguages;

}
