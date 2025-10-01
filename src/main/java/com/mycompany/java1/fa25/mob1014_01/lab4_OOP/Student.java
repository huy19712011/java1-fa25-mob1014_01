package com.mycompany.java1.fa25.mob1014_01.lab4_OOP;

import java.util.Scanner;

public class Student {
   // 1. Fields - thuoc tinh, data
    private Long id;
    private String name;
    private String email;
    private String phone;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Id: ");
        this.id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Nhap ten: ");
        this.name = scanner.nextLine();

        System.out.print("Nhap Email: ");
        this.email = scanner.nextLine();

        System.out.print("Nhap Phone: ");
        this.phone = scanner.nextLine();

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

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + '}';
    }

}
