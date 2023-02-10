package com.java.academy.satisfactionform.controller;

import com.java.academy.satisfactionform.entity.SatisfactionFormData;
import com.java.academy.satisfactionform.repository.SatisfactionFormDataRepository;
import com.java.academy.satisfactionform.services.SatisfactionFormDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class MainController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private SatisfactionFormDataService satisfactionFormDataService;

    @Autowired
    private SatisfactionFormDataRepository satisfactionFormDataRepository;

    /*
     * This method is used to check if the application is running
     */
    @GetMapping("/healthCheck")
    public HttpStatus helloWorld() {
        LOGGER.info("Received request to check health status");
        return HttpStatus.OK;
    }

    /*
     * This method is used to get all the data from the database
     */
    @GetMapping("/satisfactionApplications")
    public List<SatisfactionFormData> getSatisfactionFormApplications() {
        LOGGER.info("Received request to get all satisfaction form applications");
        return satisfactionFormDataService.getSatisfactionFormData();
    }

    /*
     * This method is used to save the data to the database
     */
    @PostMapping(path="/satisfactionApplications", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveAcademyFormData(@RequestBody SatisfactionFormData satisfactionFormData) {
        LOGGER.info("Received request to save a satisfaction form application");
        if (Objects.isNull(satisfactionFormData)) {
            LOGGER.warn("Received a null satisfaction form data object");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        satisfactionFormDataRepository.saveAndFlush(satisfactionFormData);
        LOGGER.info("Saved a new satisfaction form application with id: {}", satisfactionFormData.getId());
        return new ResponseEntity<>("New Satisfaction Form Submitted. \n{\"id\":" + satisfactionFormData.getId() + '}', HttpStatus.CREATED);
    }

}
