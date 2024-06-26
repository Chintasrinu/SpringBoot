package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Doucement.DrivingLicense;

public interface IDrivingLicenseRepo extends MongoRepository<DrivingLicense, Long> {

}
