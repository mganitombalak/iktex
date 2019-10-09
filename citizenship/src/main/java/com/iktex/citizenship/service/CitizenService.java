package com.iktex.citizenship.service;

import com.iktex.citizenship.entity.Citizen;
import com.iktex.citizenship.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService {

    @Autowired
    private CitizenRepository citizenRepository;

    public List<Citizen> findAll(){
        return citizenRepository.findAll();
    }
}
