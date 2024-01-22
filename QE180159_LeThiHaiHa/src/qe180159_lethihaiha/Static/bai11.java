/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha.Static;

/**
 *
 * @author admin
 */
public class bai11 {
    public static int maxOfArray (int arr[]) {
        int maxValue = arr[0] ;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static double maxOfArray (double arr[]) {
        double maxValue = arr[0] ;
        for (int i = 1; i < arr.length; i++ ) {
            if ( arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static int minOfArray (int arr[]) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }   
    public static double minOfArray (double arr[]) {
        double minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i] ;
            }
        }
        return minValue;

    }
}
