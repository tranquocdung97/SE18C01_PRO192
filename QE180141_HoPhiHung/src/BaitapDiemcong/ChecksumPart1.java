/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaitapDiemcong;

import java.util.Scanner;

public class ChecksumPart1 {
    public static int checksumPart1(long barcode) {
        int sum = 0;
        int[] mang = new int[11];
        for (int i = 10; i >= 0; i--) {
            mang[i] = (int) (barcode % 10);// tách chuỗi  
            barcode /= 10;
        }
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                sum += mang[i] * 3;
            } else {
                sum += mang[i];
            }
        }
        return (10 - sum % 10) % 10;// lay phan du cua sum , %10  chặn số TH 10 - 0 = 10 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma vach : ");
        long barcode = scanner.nextLong();

        if (barcode >= 1 && barcode < 100000000000L) {
            int result = checksumPart1(barcode);
            System.out.println("Checksum cho vach ma " + barcode + "la : " + result );
        } else {
            System.out.println("Ma vach khong hop le .");
        }
    }
}

