/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180128_trieuthithuhien;

/**
 *
 * @author TRIEU HIEN
 */
public class d5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int count = 0;
        for( int i =0; i < n; i++){
            if(arr[i] == k){
                count++;
            }
        }
        System.out.print(count);
    }
}
