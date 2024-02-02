/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FPTSHOP
 */
class ArrayCalculator {
    public static int maxOfArray (int arr[]){
        int max = arr[0];
        for(int i=1 ; i< arr.length ; i++)
        {
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }
    public static double maxOfArray(double arr[]){
        double max = arr[0];
        for(int i=1 ; i< arr.length ; i++)
        {
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }
    public static int minOfArray (int arr[]){
        int min = arr[0];
        for(int i=1 ; i< arr.length ; i++)
        {
            if(min>arr[i])
                min = arr[i];
        }
        return min;
    }
    public static double minOfArray(double arr[]){
        double min = arr[0];
        for(int i=1 ; i< arr.length ; i++)
        {
            if(min>arr[i])
                min = arr[i];
        }
        return min;
    }
}
public class bai11 {
    
}
