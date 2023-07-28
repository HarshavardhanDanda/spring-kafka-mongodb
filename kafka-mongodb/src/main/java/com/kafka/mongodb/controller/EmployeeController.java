package com.kafka.mongodb.controller;

import com.kafka.mongodb.entity.Employee;
import com.kafka.mongodb.kafka.KafkaProducer;
import com.kafka.mongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/publish")
    public void sendEmployeeData(@RequestBody Employee employee){
        kafkaProducer.sendMessage(employee);
    }
}
