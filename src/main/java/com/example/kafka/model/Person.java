package com.example.kafka.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
@Data
public class Person {

    private String id;
    private String name;
    private int age;
    
}
