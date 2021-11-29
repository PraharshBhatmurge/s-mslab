package com.example.visa.repository;

import com.example.visa.entity.Visa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisaRepository extends JpaRepository<Visa, Long> {

    Visa findByVisaId(Long visaId);
}