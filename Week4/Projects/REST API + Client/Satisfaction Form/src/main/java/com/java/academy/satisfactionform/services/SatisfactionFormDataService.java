package com.java.academy.satisfactionform.services;

import com.java.academy.satisfactionform.entity.SatisfactionFormData;
import com.java.academy.satisfactionform.repository.SatisfactionFormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SatisfactionFormDataService {

    @Autowired
    private SatisfactionFormDataRepository satisfactionFormDataRepository;


    // This method is used in MainController to get all the data from the database
    public List<SatisfactionFormData> getSatisfactionFormData() {
        return satisfactionFormDataRepository.findAll();
    }


}
