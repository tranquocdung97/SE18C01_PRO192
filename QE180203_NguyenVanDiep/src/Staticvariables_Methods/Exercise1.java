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
public class Exercise1 {
    public static double PI=3.14;
    public static int abs(int x)
    {
        return x<0 ? -x : x;
    }
    public static int add(int x, int y)
    {
        return x+y;
    }
    public static int subtract(int x, int y)
    {
        return x-y;
    }
    public static int min(int x, int y)
    {
        return x<y ? x : y;
    }
    public static int max(int x, int y)
    {
        return x>y ? x : y;
    }
    public static int pow(int x, int y)
    {
        int power=1;
        for(int i=0; i<y; i++)
            power *= x;
        return power;
    }
}
