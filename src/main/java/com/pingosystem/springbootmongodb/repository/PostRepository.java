package com.pingosystem.springbootmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pingosystem.springbootmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
 //the CRUD is included
	
	List<Post> findByTitleContainingIgnoreCase(String text); //Ignoring UPPER or DOW Case
}
