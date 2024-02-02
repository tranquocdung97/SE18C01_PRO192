/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress_test;

/**
 *
 * @author FPTSHOP
 */
public class Bai1 {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 3;
        long barcode = 29104150021L;
        while (barcode > 0) {
            int d = (int) (barcode % 10);
            sum += d * mul;
            mul = 4 - mul;
            barcode = barcode / 10;

        }
        int check = (10 - (sum % 10)) % 10;
        System.out.println(check);
    }
}
