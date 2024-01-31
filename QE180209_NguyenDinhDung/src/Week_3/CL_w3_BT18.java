/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_3;

class ArrayCalculator {

    public static int maxOfArray(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static double maxOfArray(double a[]) {
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static int minOfArray(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static double minOfArray(double a[]) {
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}

/**
 *
 * @author Administrator
 */
public class CL_w3_BT18 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 2};
        double[] arr2 = new double[]{1.3, 4.2, 6.7};

        System.out.println(ArrayCalculator.minOfArray(arr1));
        System.out.println(ArrayCalculator.minOfArray(arr2));
        System.out.println(ArrayCalculator.maxOfArray(arr1));
        System.out.println(ArrayCalculator.maxOfArray(arr2));
    }
}
