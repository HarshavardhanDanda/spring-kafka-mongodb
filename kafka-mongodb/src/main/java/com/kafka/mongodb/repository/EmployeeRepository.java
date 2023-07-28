package com.kafka.mongodb.repository;

import com.kafka.mongodb.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
