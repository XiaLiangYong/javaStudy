package com.example.springbootmongodb.repository;


import com.example.springbootmongodb.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);

}