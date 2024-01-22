/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.loopstatement_while_do_while;

/**
 *
 * @author trieu
 */
public class bai8 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if(i%10 == 0){
            System.out.print(i+" ");
        }
        i++;
        } while (i <= 1000);
    }
}
