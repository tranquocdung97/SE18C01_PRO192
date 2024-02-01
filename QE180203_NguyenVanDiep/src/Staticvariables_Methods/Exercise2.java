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
public class Exercise2 {
    public static int sumOfArray(int arr[])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
            sum += arr[i];
        return sum;
    }
    public static double sumOfArray(double arr[])
    {
        double sum=0;
        for(int i=0; i<arr.length; i++)
            sum += arr[i];
        return sum;
    }
}
