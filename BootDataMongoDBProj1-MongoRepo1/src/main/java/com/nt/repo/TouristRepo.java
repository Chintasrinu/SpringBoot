package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Doucement.Tourist;

public interface TouristRepo extends MongoRepository<Tourist, String> {

}
