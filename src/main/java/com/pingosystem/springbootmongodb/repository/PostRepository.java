package com.pingosystem.springbootmongodb.repository;

import java.util.Date;
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
	
	//Ignoring UPPER or DOW Case
	List<Post> findByTitleContainingIgnoreCase(String text); 
	
	//minDate ?1 maxDate ?2 comments is a List, to access the text it stay === comments.text
	@Query("{ $and: [ { date: {$gte: ?1} }, { date: { $lte: ?2} } , { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
	List<Post> fullSearch(String text, Date minDate, Date maxDate);
}
