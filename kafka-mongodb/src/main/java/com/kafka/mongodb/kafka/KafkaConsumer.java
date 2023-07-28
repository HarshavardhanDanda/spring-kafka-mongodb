package com.kafka.mongodb.kafka;

import com.kafka.mongodb.entity.Employee;
import com.kafka.mongodb.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @Autowired
    private EmployeeService employeeService;

    @KafkaListener(topics="employeetopic", groupId="myGroup")
    public void consume(Employee employee){
        LOGGER.info(String.format("the message is consumed -> %s", employee));
        employeeService.saveEmployee(employee);
    }
}
