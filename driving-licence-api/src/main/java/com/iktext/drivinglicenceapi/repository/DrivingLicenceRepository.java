package com.iktext.drivinglicenceapi.repository;

import com.iktext.drivinglicenceapi.entity.DrivingLicence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrivingLicenceRepository extends JpaRepository<DrivingLicence,Integer> {
}
