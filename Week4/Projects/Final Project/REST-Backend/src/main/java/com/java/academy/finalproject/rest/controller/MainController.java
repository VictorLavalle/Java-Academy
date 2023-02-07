package com.java.academy.finalproject.rest.controller;

import com.java.academy.finalproject.rest.entities.AcademyFormData;
import com.java.academy.finalproject.rest.exceptions.AcademyMemberNotFoundException;
import com.java.academy.finalproject.rest.services.AcademyFormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private AcademyFormDataService academyFormDataService;

    @GetMapping("/healthCheck")
    public HttpStatus helloWorld() {
        return HttpStatus.OK;
    }

    @GetMapping("/academyApplications")
    public List<AcademyFormData> getAcademyFormApplications() {

        if (academyFormDataService.getAcademyFormData().isEmpty())
            throw new AcademyMemberNotFoundException("No data found");

        return academyFormDataService.getAcademyFormData();
    }

    @PostMapping("/academyApplications")
    public AcademyFormData saveAcademyFormData(@RequestBody AcademyFormData data) {
        return academyFormDataService.saveAcademyFormData(data);
    }

    @PutMapping("/academyApplications/{id}")
    public AcademyFormData updateAcademyFormData(@PathVariable("id") long id, @RequestBody AcademyFormData data) {

        if (data.getId() != id)
            throw new AcademyMemberNotFoundException("Id in path and body are different");

        return academyFormDataService.updateAcademyFormData(id, data);
    }

    @DeleteMapping("/academyApplications/{id}")
    public void deleteAcademyFormData(@PathVariable("id") long id) {

        if (academyFormDataService.getAcademyFormData().stream().noneMatch(a -> a.getId() == id))
            throw new AcademyMemberNotFoundException("Id not found");

        academyFormDataService.deleteAcademyFormData(id);
    }

}
