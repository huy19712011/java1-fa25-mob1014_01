package com.mycompany.java1.fa25.mob1014_01.lab1;

import java.util.Scanner;

public class B2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai canh thu nhat: ");
        float canh1 = scanner.nextFloat();
        System.out.print("Nhap chieu dai canh thu hai: ");
        float canh2 = scanner.nextFloat();

//        float min = Math.min(canh1, canh2);

        System.out.printf("Chu vi hinh chu nhat = %.2f", (canh1 + canh2) * 2);
        System.out.println();
        System.out.printf("Dien tich hinh chu nhat = %.2f", (canh1 * canh2));
        System.out.println();
        System.out.printf("Chieu dai canh nho nhat = %.2f", Math.min(canh1, canh2));

    }

}
