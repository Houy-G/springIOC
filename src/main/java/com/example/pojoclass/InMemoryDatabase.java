package com.example.pojoclass;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@Configurable
public class InMemoryDatabase {
    @Bean
    public List<Student> studentList(){
        studentList().add(new Student(1,"Liam David Rodriguez","M",100.0));
        studentList().add(new Student(2,"Olivia Grace Chen","M",80.0));
        studentList().add(new Student(3,"Ethan James Miller","F",100.0));
        studentList().add(new Student(4,"Ava Sophia Kim","M",20.0));
        studentList().add(new Student(5,"Noah Alexander Patel","F",52.0));
        studentList().add(new Student(6,"Isabella Marie Garcia","F",63.0));
        studentList().add(new Student(7,"Mason William Smith","M",79.0));
        studentList().add(new Student(8,"Charlotte Elizabeth Brown","M",80.5));
        studentList().add(new Student(9,"Benjamin Thomas Johnson","F",57.0));
        studentList().add(new Student(10,"Amelia Rose Davis","M",90.0));
        return  studentList();
    }
}
