package com.mycompany.java1.fa25.mob1014_01.ass1;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;
    private final StudentService service;

    public Menu(StudentService service) {
        this.scanner = new Scanner(System.in);
        this.service = service;
    }

    // Show menu cho nguoi dung chon
    public void show() {
        int choice;
        do {
            printMenu();
            choice = getChoice();
            handleChoice(choice);
        } while (choice != 0);

    }

    //
    private void printMenu() {

        System.out.println("\n======Student Management======");
        System.out.println("1. Show all students");
        System.out.println("2. Add new student");
        System.out.println("3. Update student");
        System.out.println("4. Remove student");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");

    }

    private int getChoice() {

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Enter a number!");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private void handleChoice(int choice) {

        scanner.nextLine(); // new line

        switch(choice) {
            case 1 -> showStudent();
            case 2 -> addStudent();
            case 3 -> updateStudent();
            case 4 -> removeStudent();
            case 0 -> System.out.println("Exit...");
            default -> System.out.println("Invalid choice, try again!");
        }

    }

    private void showStudent() {

        System.out.println("\n-----Student List--------");
        if (service.getAllStudents().isEmpty()) {
            System.out.println("No Students found.");
        } else {
            for (Student s: service.getAllStudents()) {
                System.out.println(s);
            }
        }

    }

    private void addStudent() {

        System.out.print("Enter Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        Student newStudent = new Student(id, name, age);
        service.addStudent(newStudent);
        System.out.println("Student added!");
    }

    private void updateStudent() {

    }

    private void removeStudent() {

    }



}
