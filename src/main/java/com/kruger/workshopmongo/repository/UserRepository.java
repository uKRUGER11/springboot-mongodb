package com.kruger.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kruger.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
