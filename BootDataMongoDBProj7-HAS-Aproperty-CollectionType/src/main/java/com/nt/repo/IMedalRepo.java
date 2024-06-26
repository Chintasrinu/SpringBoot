package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Doucement.Medal;

public interface IMedalRepo extends MongoRepository<Medal,String> {

}
