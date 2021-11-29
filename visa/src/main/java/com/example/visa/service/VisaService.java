package com.example.visa.service;

import com.example.visa.entity.Visa;
import com.example.visa.repository.VisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VisaService {

    @Autowired
    private VisaRepository visaRepository;

    public Visa saveVisa(Visa visa) {
        return visaRepository.save(visa);
    }

    public Visa findVisaById(Long visaId) {
        return visaRepository.findByVisaId(visaId);
    }

    public List<Visa> getAllVisas() {
        return visaRepository.findAll();
    }
}