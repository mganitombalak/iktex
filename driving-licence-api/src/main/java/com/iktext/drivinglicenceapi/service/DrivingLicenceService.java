package com.iktext.drivinglicenceapi.service;

import com.iktext.drivinglicenceapi.entity.DrivingLicence;
import com.iktext.drivinglicenceapi.repository.DrivingLicenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrivingLicenceService {
    @Autowired
    private DrivingLicenceRepository repository;

    public List<DrivingLicence> findAll(){
     return repository.findAll();
    }
}
