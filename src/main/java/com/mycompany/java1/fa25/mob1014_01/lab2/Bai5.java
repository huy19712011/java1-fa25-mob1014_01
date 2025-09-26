package com.mycompany.java1.fa25.mob1014_01.lab2;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {

        lab2Bai5();

    }

    public static void lab2Bai5() {

           // Nhap hoten, diem toan, ly, hoa
        // Tinh diem tb
        // Xep loai:
        // 9 - 10: Xuat sac
        // 8 - 9 : Gioi
        // 7 - 8: Kha
        // 5 - 7: TB
        // <5: Yeu
        System.out.println("Lab 2 - Bai 5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap diem toan: ");
        float toan = scanner.nextFloat();
        System.out.print("Nhap diem ly: ");
        float ly = scanner.nextFloat();
        System.out.print("Nhap diem hoa: ");
        float hoa = scanner.nextFloat();

//        float diemTb = (toan + ly + hoa) / 3;
        float diemTb = tinhDiemTb(toan, ly, hoa);

        String xepLoai = xepLoai(diemTb);

        System.out.printf("Sinh vien %s dat diem TB %.2f xep loai %s%n", hoTen, diemTb, xepLoai);
    }

    public static String xepLoai(float diemTb) {
        String xepLoai = null;
        if (10 >= diemTb && diemTb >= 9) {
            xepLoai = "Xuat sac";
        } else if (9 > diemTb && diemTb >= 8) {
            xepLoai = "Gioi";
        } else if (8 > diemTb && diemTb >= 7) {
            xepLoai = "Kha";
        } else if (7 > diemTb && diemTb >= 5) {
            xepLoai = "Trung binh";
        } else {
            xepLoai = "Yeu";
        }
        return xepLoai;
    }

    public static float tinhDiemTb(float mon1, float mon2, float mon3) {

        return (mon1 + mon2 + mon3) / 3;
    }

}
