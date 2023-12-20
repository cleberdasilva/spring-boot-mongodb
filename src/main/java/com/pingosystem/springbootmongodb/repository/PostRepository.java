package com.pingosystem.springbootmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.pingosystem.springbootmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
 //the CRUD is included
	
	//?0 says that I´ll get the first parameter i -> case-insensitive
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }") 
	List<Post> searchTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text); //Ignoring UPPER or DOW Case
}
