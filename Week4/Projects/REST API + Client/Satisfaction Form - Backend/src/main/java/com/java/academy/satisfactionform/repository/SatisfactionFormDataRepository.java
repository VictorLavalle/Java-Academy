package com.java.academy.satisfactionform.repository;

import com.java.academy.satisfactionform.entity.SatisfactionFormData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SatisfactionFormDataRepository extends JpaRepository<SatisfactionFormData, Long> {}

