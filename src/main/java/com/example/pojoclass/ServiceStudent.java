package com.example.pojoclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServiceStudent {
    private List<Student> studentList;
    @Autowired
    public ServiceStudent(List<Student> studentList){
        this.studentList=studentList;
    }
    public Student inserting(){
        Student student = new Student(11,"Joe","M",100.0);
        studentList.add(student);
        return student;
    }
    public List<Student> selecting(){
        return studentList;
    }
    public Student selectingByID(int id){
        return studentList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public Student updatingByID(int id){
        Student student = selectingByID(id);
        if (student != null) {
            student.setName("KoKO");
            student.setGender("M");
            student.setScore(99.0);
        }
        return student;
    }
    public Integer deletingByID(int id){
        Student student = selectingByID(id);
        if (student != null) {
            studentList.remove(student);
            return 1;
        }
        return 0;
    }
}
