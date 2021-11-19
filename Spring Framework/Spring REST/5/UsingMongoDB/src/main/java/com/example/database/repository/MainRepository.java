package com.example.database.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.database.model.Employee;

public interface MainRepository extends MongoRepository<Employee, Integer> {



}
