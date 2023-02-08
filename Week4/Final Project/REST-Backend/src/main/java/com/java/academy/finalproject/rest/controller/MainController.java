package com.java.academy.finalproject.rest.controller;

import com.java.academy.finalproject.rest.entities.AcademyFormData;
import com.java.academy.finalproject.rest.exceptions.AcademyMemberNotFoundException;
import com.java.academy.finalproject.rest.exceptions.AcademyMemberRestExceptionHandler;
import com.java.academy.finalproject.rest.repositories.AcademyFormDataRepository;
import com.java.academy.finalproject.rest.services.AcademyFormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    private AcademyFormDataService academyFormDataService;

    @Autowired
    private AcademyFormDataRepository academyFormDataRepository;

    /*
     * This method is used to check if the application is running
     */
    @GetMapping("/healthCheck")
    public HttpStatus helloWorld() {
        return HttpStatus.OK;
    }

    /*
     * This method is used to get all the data from the database
     */
    @GetMapping("/academyApplications")
    public List<AcademyFormData> getAcademyFormApplications() {

        if (academyFormDataService.getAcademyFormData().isEmpty())
            throw new AcademyMemberNotFoundException("No data found");

        return academyFormDataService.getAcademyFormData();
    }


    /*
     * This method is used to get a specific item from the database
     */
    @GetMapping(path = "/academyApplications/{id}")
    public ResponseEntity<AcademyFormData> getAcademyMember(@PathVariable long id) {
        Optional<AcademyFormData> academyFormDataOptional = academyFormDataRepository.findById(id);
        return academyFormDataOptional.map(academyFormData -> new ResponseEntity<>(academyFormData, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    /*
     * This method is used to save the data to the database
     */
    @PostMapping(path="/academyApplications", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveAcademyFormData(@RequestBody AcademyFormData academyFormData) {

        if (academyFormDataService.getAcademyFormData().stream().anyMatch(a -> Objects.equals(a.getId(), academyFormData.getId())))
            throw new AcademyMemberNotFoundException("Id already exists" + HttpStatus.CONFLICT);

        academyFormDataRepository.saveAndFlush(academyFormData);
        return new ResponseEntity<>("Academy Member Created. \n{\"id\":" + academyFormData.getId() + '}', HttpStatus.CREATED);
    }


    /*
     * This method is used to update the data in the database
     */
    @PutMapping(path="/academyApplications/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateAcademyFormData(@PathVariable Long id, @RequestBody AcademyFormData academyFormData) {
        if (academyFormDataRepository.findById(id).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        academyFormData.setId(id);
        academyFormDataRepository.save(academyFormData);
        return new ResponseEntity<>("Academy Member updated", HttpStatus.OK);
    }


    /*
     * This method is used to delete a data from the database
     */
    @DeleteMapping("/academyApplications/{id}")
    public ResponseEntity<String> deleteAcademyFormData(@PathVariable long id) {

        Optional<AcademyFormData> academyFormDataOptional = academyFormDataRepository.findById(id);
        if (academyFormDataOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        academyFormDataRepository.delete(academyFormDataOptional.get());
        return new ResponseEntity<>("Academy Member deleted", HttpStatus.OK);
    }


    /*
     * This method is used to delete all the data from the database
     */
    @DeleteMapping("/academyApplications")
    public ResponseEntity<String> deleteAllAcademyFormData() {
        academyFormDataRepository.deleteAll();
        return new ResponseEntity<>("All Academy Members deleted", HttpStatus.OK);
    }

}
