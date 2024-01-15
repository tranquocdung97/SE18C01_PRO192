/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180128_trieuthithuhien;

/**
 *
 * @author TRIEU HIEN
 */
public class b10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x >= 0 && y >= 0){
            System.out.println("This point lies in the First quadrant");
        }
        if(x <= 0 && y >= 0){
            System.out.println("This point lies in the Second quadrant");
        }
        if(x <= 0 && y <= 0){
            System.out.println("This point lies in the Third quadrant");
        }
        if(x >= 0 && y <= 0){
            System.out.println("This point lies in the Fourth quadrant");
        }
    }
}
