package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Doucement.Sport;

public interface ISportRepo extends MongoRepository<Sport,Integer> {

}
