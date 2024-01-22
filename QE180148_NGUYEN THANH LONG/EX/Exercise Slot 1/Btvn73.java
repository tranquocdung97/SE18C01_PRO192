
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Btvn73 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int z = 0;
    for (int i = 0 ; i < s.length(); i++)
    {
        if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        {
            z++;
        }
    }
    System.out.print(z);
    }    
}
