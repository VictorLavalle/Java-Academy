package com.java.academy.satisfactionform.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "SatisfactionFormData")
@Table(name = "satisfaction_form_data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SatisfactionFormData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_satisfaction_form")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "general_satisfaction")
    private String generalSatisfaction;

    @Column(name = "teacher_satisfaction")
    private String teacherSatisfaction;

    @Column(name = "course_satisfaction")
    private String checkpointSatisfaction;

}
