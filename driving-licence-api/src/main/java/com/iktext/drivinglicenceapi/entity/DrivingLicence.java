package com.iktext.drivinglicenceapi.entity;

import lombok.Cleanup;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DrivingLicence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int citizenId;
    @Column(length = 25)
    private String serino;
    private int type;
}
