/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dealine;

import static dealine.fraction.fraction;
import java.util.Scanner;

/**
 *
 * @author XUAN HIEN
 */
//class fraction{
//    public static int fraction(int a[]){
//        int sum=0;
//        for(int i=0; i<a.length;i++){
//            sum +=1 /()
//        }
//        return 0;
//        
//    }   
//}
//public class bai3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        System.out.println("result: "+ fraction(a));
//    }
//}
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
        System.out.println("CFP result: " + CFP(a)); //
    }
}
