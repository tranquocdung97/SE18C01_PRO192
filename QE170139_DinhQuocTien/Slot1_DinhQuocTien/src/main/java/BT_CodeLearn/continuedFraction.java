/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_CodeLearn;

/**
 *
 * @author ASUS
 */
int continuedFraction(int[] a) {
    int[] res = {0, 0};
    int b = 1;
    for (int i = a.length-1; i >0; i--) {
        a[i-1] = a[i-1]*a[i] + b;
        b = a[i];
    }
    return a[0]*b;
}

