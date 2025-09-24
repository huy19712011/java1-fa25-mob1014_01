package com.mycompany.java1.fa25.mob1014_01.lab3;

public class ForLoopDemo {

    public static void main(String[] args) {

        System.out.println("For Loop examples");

        for (int i = 0; i < 5; i++) {

            System.out.println(i);
        }

        int sum = 0;
        for (int j = 0; j <= 10; j = j + 2) {

            sum = sum + j;
        }
        System.out.println("Sum = " + sum);
    }

}
