package com.mycompany.java1.fa25.mob1014_01.lab4_OOP;

import java.util.Scanner;

public class ClassObjectDemo {

    public static void main(String[] args) {
        System.out.println("OOP basics");

        Student student1 = new Student(1L, "Student 1", "Email 1", "Phone 1");

//        System.out.println(student1.getId());
//        System.out.println(student1.getName());
//        System.out.println(student1.getEmail());
//        System.out.println(student1.getPhone());

        student1.output();


        Student student2 = new Student();
        student2.setId(2L);
        student2.setName("Student 2");
//        student2.output();
        student2.setEmail("Email 2");
        student2.setPhone("Phone 2");
        student2.output();

        //
        Student student3 = new Student(3L);
        student3.setName("Nguyen Manh Phuc");
        student3.setEmail("manhphuc300501@gmail.com");
        student3.setPhone("0943718195");
        student3.output();

        //
        Student student4 = new Student();
        student4.input();
        student4.output();
    }

}

