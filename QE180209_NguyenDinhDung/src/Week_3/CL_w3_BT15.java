/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_3;

class Math {

    public static double PI = 3.14;

    public static int abs(int x) {
        return x < 0 ? -x : x;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int min(int x, int y) {
        return x > y ? y : x;
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static int pow(int x, int y) {
        int a = 1;
        for (int i = 0; i < y; i++) {
            a *= x;
        }
        return a;
    }
}

/**
 *
 * @author Administrator
 */
public class CL_w3_BT15 {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.abs(-2));
        System.out.println(Math.add(2, 3));
        System.out.println(Math.subtract(2, 3));
        System.out.println(Math.min(2, 3));
        System.out.println(Math.max(2, 3));
        System.out.println(Math.pow(2, 3));
    }
}
