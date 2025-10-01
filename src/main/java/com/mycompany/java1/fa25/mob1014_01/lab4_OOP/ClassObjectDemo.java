package com.mycompany.java1.fa25.mob1014_01.lab4_OOP;

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
        student2.setEmail("Email 2");
        student2.setPhone("Phone 2");
        student2.output();
    }

}

class Student {

    // 1. Fields - thuoc tinh, data
    Long id;
    String name;
    String email;
    String phone;

    // 2a. Constructor(s) (Ham tao - tao ra cac doi tuong cu the)
    public Student() { // constructor khong tham so - default constructor

    }

    public Student(Long id) {
        this.id = id;
    }

    public Student(Long id, String name, String myEmail, String myPhone) {
        this.id = id;
        this.name = name;
        email = myEmail;
        phone = myPhone;
    }

    // 2b. Methods (member funtions)
    public void input() { // nhap du lieu tu ban phim
        //
    }

    public void output() { // in ra man hinh
        //
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(phone);

        System.out.printf("Student: id = %d, name = %s, email = %s, phone = %s%n", id, name, email, phone);

    }

    // 2c. Getters, Setters - get, set gia tri cho cac truong
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
