package com.example.visa.controller;

import com.example.visa.entity.Visa;
import com.example.visa.service.VisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/visa")
public class VisaController {

    @Autowired
    private VisaService visaService;

    @PostMapping("/")
    public Visa saveVisa(@RequestBody Visa visa) {
        return visaService.saveVisa(visa);
    }

    @GetMapping("/{id}")
    public Visa findVisaById(@PathVariable("id") Long visaId) {
        return visaService.findVisaById(visaId);
    }

    @GetMapping("/getall")
    public List<Visa> getAllVisas() {
        return visaService.getAllVisas();
    }

}