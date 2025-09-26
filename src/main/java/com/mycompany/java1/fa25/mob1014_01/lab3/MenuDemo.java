package com.mycompany.java1.fa25.mob1014_01.lab3;

import com.mycompany.java1.fa25.mob1014_01.lab1.B1;
import com.mycompany.java1.fa25.mob1014_01.lab2.Bai5;
import java.util.Scanner;

public class MenuDemo {

    public static void main(String[] args) {
        System.out.println("Menu example");

        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {

            System.out.println("Menu");
            System.out.println("1: lab2 - Bai 5");
            System.out.println("2: lab1 - Bai1");
            System.out.println("3: Bai3");
            System.out.println("4: Bai4");
            System.out.println("9: Thoat");

            System.out.print("Nhap lua chon: ");
            luaChon = scanner.nextInt();

            switch(luaChon) {
                case 1:
                    // goi ham, ...
                    //System.out.println("Lua chon 1");
                    Bai5.lab2Bai5();
                    break;
                case 2:
                    B1.lab1B1();
                    break;

            }

        } while (luaChon != 9);

    }

}
