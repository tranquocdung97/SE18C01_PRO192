/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress_test;

/**
 *
 * @author FPTSHOP
 */
static int continuedFraction(int[] a) {
    int n = a.length;
    int numerator = a[n - 1]; 
    int denominator = 1; 
        for (int i = n - 2; i >= 0; i--) {
            int temp = numerator;
            numerator = a[i] * numerator + denominator;
            denominator = temp;
        }
    return denominator * numerator ;
}
public class bai3 {
    public static void main (String[] args){
        int[] arry= {2,4};
        System.out.print(continuedFraction(arry));
    
    }
}

