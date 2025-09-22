
package com.mycompany.java1.fa25.mob1014_01.lab1;

import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your mark: ");
        float mark = scanner.nextFloat();

        System.out.printf("Student %s has %.2f points", name, mark);
    }

}
