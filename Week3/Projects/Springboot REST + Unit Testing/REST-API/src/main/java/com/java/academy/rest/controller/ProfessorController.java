package com.java.academy.rest.controller;

import com.java.academy.rest.entity.Professor;
import com.java.academy.rest.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/", produces = "application/json")
public class ProfessorController {

    @Autowired
    ProfessorRepository professorRepository;

    /**
     * Get all the  'Professor' objects
     *
     * @return the JSON of 'professor' objects
     */
    @GetMapping(path = "/professors")
    public List<Professor> getAll() {
        return professorRepository.findAll();
    }

    /**
     * Get professors from its repository
     *
     * @param id
     * @return the professor's id and the http status of the request
     */
    @GetMapping(path = "/professors/{id}")
    public ResponseEntity<Professor> getTeacher(@PathVariable long id) {
        Optional<Professor> professorOptional = professorRepository.findById(id);
        return professorOptional.map(professor -> new ResponseEntity<>(professor, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    /**
     * Add Professor into the arraylist
     *
     * @param professor
     * @return http status of the post request
     */
    @PostMapping(path = "/professors", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addProfessor(@RequestBody @Valid Professor professor) {
        professorRepository.saveAndFlush(professor);
        System.out.println("****************"+professor.getId());
        return new ResponseEntity<>("{\"id\":" + professor.getId() + '}', HttpStatus.CREATED);
    }


    /**
     * update Professor
     *
     * @param professor
     * @return http status of the post request from the update
     */
    @PutMapping(path = "/professors/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateProfessor(@PathVariable Long id, @RequestBody @Valid Professor professor) {
        if (professorRepository.findById(id).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        professor.setId(id);
        professorRepository.save(professor);
        return new ResponseEntity<>("Professor updated", HttpStatus.OK);
    }

    /**
     * delete Professor
     *
     * @param id
     * @return http status of the post request from the delete
     */
    @DeleteMapping(path = "/professors/{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable long id) {
        Optional<Professor> professorOptional = professorRepository.findById(id);
        if (professorOptional.isEmpty()) {
            return new ResponseEntity<>("Professor: ", HttpStatus.NOT_FOUND);
        }
        professorRepository.delete(professorOptional.get());
        return new ResponseEntity<>("Professor updated", HttpStatus.OK);
    }

}

