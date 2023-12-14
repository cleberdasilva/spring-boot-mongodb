package com.pingosystem.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pingosystem.springbootmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
 //the CRUD is included
}
