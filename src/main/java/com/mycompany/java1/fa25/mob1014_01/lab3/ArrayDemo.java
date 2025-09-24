package com.mycompany.java1.fa25.mob1014_01.lab3;

public class ArrayDemo {

    public static void main(String[] args) {
        System.out.println("Array Examples");

        //
        String[] cars = {"Honda", "Ford", "Toyota"};
        System.out.println(cars[0]);
        cars[0] = "Bmw";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        //
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // new

        // for each
        for (String car : cars) {
            System.out.println(car);
        }
    }

}
