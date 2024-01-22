/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_2;

/**
 *
 * @author XUAN HIEN
 */
class ArrayCalculator {

    public static int sumOfArray(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static double sumOfArray(double a[]) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

public class bai9 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 2};
        double[] arr2 = new double[]{1.3, 4.2, 6.7};
        System.out.println(ArrayCalculator.sumOfArray(arr1));
        System.out.println(ArrayCalculator.sumOfArray(arr2));
    }
}
