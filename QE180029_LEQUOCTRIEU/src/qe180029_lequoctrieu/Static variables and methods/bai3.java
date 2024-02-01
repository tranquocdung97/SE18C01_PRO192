/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trieu
 */
class ArrayCalculator{
    public static int maxOfArray(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static double maxOfArray(double arr[]){
        double max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int minOfArray(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static double minOfArray(double arr[]){
        double min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
public static void main(String[] args) {
    int[] arr1 = new int[] { 3, 4, 2 };
    double[] arr2 = new double[] { 1.3, 4.2, 6.7 };

    System.out.println(ArrayCalculator.minOfArray(arr1));
    System.out.println(ArrayCalculator.minOfArray(arr2));
    System.out.println(ArrayCalculator.maxOfArray(arr1));
    System.out.println(ArrayCalculator.maxOfArray(arr2));
}

