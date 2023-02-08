package com.java.academy.finalproject.rest.services;

import com.java.academy.finalproject.rest.entities.AcademyFormData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.java.academy.finalproject.rest.repositories.AcademyFormDataRepository;

@Service
public class AcademyFormDataService {

    @Autowired
    private AcademyFormDataRepository academyFormDataRepository;


    // This method is used in MainController to save the data to the database
    public AcademyFormData saveAcademyFormData(
            AcademyFormData academyFormData
    ) {
        switch (academyFormData.getRole()) {
            case "0" -> academyFormData.setRole("Student");
            case "1" -> academyFormData.setRole("Instructor");
            case "2" -> academyFormData.setRole("Human Resources");
            case "3" -> academyFormData.setRole("Other");
        }

        return academyFormDataRepository.saveAndFlush(academyFormData);
    }


    // This method is used in MainController to get all the data from the database
    public List<AcademyFormData> getAcademyFormData() {
        return academyFormDataRepository.findAll();
    }

    // This method is used in MainController to update the data in the database
    public AcademyFormData updateAcademyFormData(long id, AcademyFormData academyFormData) {
        return academyFormDataRepository.saveAndFlush(academyFormData);
    }

    // This method is used in MainController.java to delete a data from the database
    public void deleteAcademyFormData(long id) {
        academyFormDataRepository.deleteById(id);
    }


    // This method is used to delete thw whole data from the database
    public void deleteAcademyFormData(AcademyFormData academyFormData) {
        academyFormDataRepository.delete(academyFormData);
    }

}
