package com.example.pojoclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class PoJoClassApplication implements CommandLineRunner {
    private Scanner scanner = new Scanner(System.in);

    private final ServiceStudent serviceStudent;

    @Autowired
    public PoJoClassApplication(ServiceStudent serviceStudent) {
        this.serviceStudent = serviceStudent;
    }

    public static void main(String[] args) {
        SpringApplication.run(PoJoClassApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inserting new student:");
        Student insertedStudent = serviceStudent.inserting();
        System.out.println("Inserted: " + insertedStudent);

        System.out.println("\nAll students:");
        List<Student> students = serviceStudent.selecting();
        students.forEach(System.out::println);

        System.out.println("\nSelecting student by ID :");
        Student selectedStudent = serviceStudent.selectingByID(scanner.nextInt());
        System.out.println("Selected: " + selectedStudent);

        System.out.println("\nUpdating student by ID :");
        Student updatedStudent = serviceStudent.updatingByID(scanner.nextInt());
        System.out.println("Updated: " + updatedStudent);

        System.out.println("\nDeleting student by ID :");
        Integer deleteResult = serviceStudent.deletingByID(scanner.nextInt());
        System.out.println("Delete result: " + deleteResult);

        System.out.println("\nFinal list of students:");
        List<Student> finalStudents = serviceStudent.selecting();
        finalStudents.forEach(System.out::println);
    }
}