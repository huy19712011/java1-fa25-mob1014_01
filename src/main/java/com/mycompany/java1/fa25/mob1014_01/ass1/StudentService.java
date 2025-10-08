package com.mycompany.java1.fa25.mob1014_01.ass1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StudentService {

    //1. data
    private List<Student> students = new ArrayList();

    //2b. methods
    // Them sv vao danh sach
    public void addStudent(Student student) {

        students.add(student);
    }

    // Lay ra toan bo sv (danh sach sv)
    public List<Student> getAllStudents() {

        return students;
    }

    // Tim sv theo id
    public Student findStudentById(int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    // Sua sv theo id
    public boolean updateStudent(int id, String newName, int newAge) {

        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setAge(newAge);
                return true;
            }
        }

        return false;
    }

    // Xoa sv theo id
    public boolean removeStudent(int id){

        return students.remove(findStudentById(id));
    }

}
