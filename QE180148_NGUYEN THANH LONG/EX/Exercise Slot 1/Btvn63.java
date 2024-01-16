/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex;

/**
 *
 * @author Admin
 */
public class Btvn63 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int s = 0;
        for (int i=0 ; i <n ; i++)
        {
            if( arr[i] % 2 != 0 && arr[i] > 0)
            {
                s = s + arr[i];
            }
        }
        System.out.print(s);
	}    
}
