/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_2;

/**
 *
 * @author XUAN HIEN
 */
class ArrayCalculator1 {

    public static int maxOfArray(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static double maxOfArray(double a[]) {
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int minOfArray(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static double minOfArray(double a[]) {
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}

public class bai10 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 2};
        double[] arr2 = new double[]{1.3, 4.2, 6.7};

        System.out.println(ArrayCalculator1.minOfArray(arr1));
        System.out.println(ArrayCalculator1.minOfArray(arr2));
        System.out.println(ArrayCalculator1.maxOfArray(arr1));
        System.out.println(ArrayCalculator1.maxOfArray(arr2));
    }
}
