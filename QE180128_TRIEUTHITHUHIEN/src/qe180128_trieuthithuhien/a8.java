/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180128_trieuthithuhien;

/**
 *
 * @author TRIEU HIEN
 */
public class a8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i +" ");
            }
        }
    }
}
