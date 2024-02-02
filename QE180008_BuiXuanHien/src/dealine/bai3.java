/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dealine;

class bai3 {

    public static int CFP(int[] a) {
        int n = a.length;
        int num = a[n - 1], den = 1;

        for (int i = n - 2; i >= 0; i--) {
            int tempNum = a[i] * num + den;
            int tempDen = num;

            num = tempNum;
            den = tempDen;
        }

        return num * den;
    }

    public static void main(String[] args) {
        int[] a = {2, 4};
        System.out.println("CFP result: " + CFP(a)); 
    }
}
