/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staticvariables_Methods;

/**
 *
 * @author ADMIN
 */
public class Exercise3 {
    public static int maxOfArray(int arr[])
    {
        int max=arr[0];
        for(int i=1; i<arr.length; i++)
            if(max<arr[i]) max = arr[i];
        return max;
    }
    public static double maxOfArray(double arr[])
    {
        double max=arr[0];
        for(int i=1; i<arr.length; i++)
            if(max<arr[i]) max = arr[i];
        return max;
    }
    public static int minOfArray(int arr[])
    {
        int min=arr[0];
        for(int i=1; i<arr.length; i++)
            if(min>arr[i]) min = arr[i];
        return min;
    }
    public static double minOfArray(double arr[])
    {
        double min=arr[0];
        for(int i=1; i<arr.length; i++)
            if(min>arr[i]) min = arr[i];
        return min;
    }
}
