/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_3;

class ArrayCalculator {

    public static int sumOfArray(int arr[]) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        return a;
    }

    public static double sumOfArray(double arr[]) {
        double a = 0;
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        return a;
    }
}

/**
 *
 * @author Administrator
 */
public class CL_w3_BT17 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 2};
        double[] arr2 = new double[]{1.3, 4.2, 6.7};
        System.out.println(ArrayCalculator.sumOfArray(arr1));
        System.out.println(ArrayCalculator.sumOfArray(arr2));
    }
}
