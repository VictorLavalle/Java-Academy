package com.java.academy.rest.controller;

import com.java.academy.rest.entity.Student;
import com.java.academy.rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/", produces = "application/json")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;


    /**
     * Get all the  'Students' objects
     *
     * @return the JSON of 'professor' objects
     */
    @GetMapping(path = "/students")
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    /**
     * Get Student from its repository
     *
     * @param id
     * @return the student's id and the http status of the request
     */
    @GetMapping(path = "/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.map(student -> new ResponseEntity<>(student, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }





    /**
     * Add Student into the arraylist
     *
     * @param student
     * @return http status of the post request
     */
    @PostMapping(path = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addStudent(@RequestBody @Valid Student student) {
        studentRepository.saveAndFlush(student);
        return new ResponseEntity<>("{\"id\":" + student.getId() + '}', HttpStatus.CREATED);
    }




    /**
     * update Student
     *
     * @param student
     * @return http status of the post request from the update
     */
    @PutMapping(path = "/students/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateStudent(@PathVariable Long id, @Valid @RequestBody Student student) {
        if (studentRepository.findById(id).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        student.setId(id);
        studentRepository.save(student);
        return new ResponseEntity<>("Student updated", HttpStatus.OK);
    }




    /**
     * delete Student
     *
     * @param id
     * @return http status of the post request from the delete
     */
    @DeleteMapping(path = "/students/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        studentRepository.delete(studentOptional.get());
        return new ResponseEntity<>("Professor updated", HttpStatus.OK);
    }


}
