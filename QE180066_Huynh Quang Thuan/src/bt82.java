/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HUYNH THAO
 */
public class bt82 {
    
}
public class Gtin12CheckDigitCalculator {

    public static int calculateCheckDigit(long first11Digits) {
        String digitsStr = Long.toString(first11Digits);
        int step1Result = 0;
        for (int i = 0; i < 11; i += 2) {
            step1Result += Character.getNumericValue(digitsStr.charAt(i));
        }
        step1Result *= 3;
        int step3Result = 0;
        for (int i = 1; i < 11; i += 2) {
            step3Result += Character.getNumericValue(digitsStr.charAt(i));
        }
        int total = step1Result + step3Result;
        int checkDigit = (10 - (total % 10)) % 10;
        return checkDigit;
    }
    public static void main(String[] args) {
        long first11Digits = 12345678901L;  // Replace with your own 11 digits
        int checkDigit = calculateCheckDigit(first11Digits);
        System.out.println("Check digit: " + checkDigit);
    }
}