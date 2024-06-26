package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Doucement.Person;

public interface IPersonRepo extends MongoRepository<Person, Integer> {

}
