/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha.Static;

/**
 *
 * @author admin
 */
public class bai9 {
    public static double PI = 3.14;
    public static int abs (int x) {
        if (x < 0) return -x;
        else return x;
    }
    public static int add (int x, int y) {
        return x+y;
    }
    public static int subtract (int x, int y) {
        return x-y;
    }
    public static int min (int x, int y) {
        if (x < y) return x;
        else return y;
    }
    public static int max ( int x, int y) {
        return x > y ? x : y;
    }
    public static int pow ( int x, int y) {
        int power = 1;
        for ( int i = 0; i < y; i++) {
            power *= x;
        }
        return power;
    }
}
