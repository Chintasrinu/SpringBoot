package com.nt.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.Doucement.Player;

public interface IPlayerRepo extends MongoRepository<Player,Integer> {

}
