package com.mycompany.java1.fa25.mob1014_01.ass1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Student> students = new ArrayList(); // 0

    public static void main(String[] args) {


        //1. Them sv vao danh sach
        // tao sv moi
        Student student = new Student(1, "Student 1", 11);
        // add vao danh sach (list)
        students.add(student);

        Student student2 = new Student(2, "Student 2", 12);
        students.add(student2);

        //2. Show all students (in ra console)

        //3. Update (sua chua) - id = 2
        // tim sv co id = 2
        // update name, age cho sv
        for (Student s: students) {
            if (s.getId() == 2) {
                s.setName("Student 22");
                s.setAge(22);
            }

        }

        //3. Delete sv co id = 1

        for (Student s: students) {

            if (s.getId() == 1) {
                students.remove(s);
            }
        }


    }



}
