package com.kafka.mongodb.service;

import com.kafka.mongodb.entity.Employee;
import com.kafka.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
