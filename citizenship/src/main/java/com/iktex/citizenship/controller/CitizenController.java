package com.iktex.citizenship.controller;

import com.iktex.citizenship.entity.Citizen;
import com.iktex.citizenship.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/citizen")
public class CitizenController {

    @Autowired
    private CitizenService citizenService;

    @GetMapping
    public ResponseEntity<List<Citizen>> findAll() {
        return new ResponseEntity<>(citizenService.findAll(), HttpStatus.OK);
    }
}
