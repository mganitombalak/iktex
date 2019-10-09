package com.iktext.drivinglicenceapi.controller;

import com.iktext.drivinglicenceapi.entity.DrivingLicence;
import com.iktext.drivinglicenceapi.service.DrivingLicenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/drivinglicence")
public class DrivingLicenceController {
    @Autowired
    private DrivingLicenceService service;

    @GetMapping
    public ResponseEntity<DrivingLicence> findAll(){
        return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }
}
