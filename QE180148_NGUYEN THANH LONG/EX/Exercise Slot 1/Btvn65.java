/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex;

/**
 *
 * @author Admin
 */
public class Btvn65 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt ();
        int[] a= new int[n];
        for (int i =0; i < n ; i++)
        {
            a[i]= sc.nextInt();
        }
        for (int i =0 ; i < n ; i++)
        {
            for ( int j = i; j < n; j++)
            {
                if (a[j] < a[i])
                {
                    int z = a[i];
                    a[i] = a[j];
                    a[j]= z;
                }
            }
        }
        for (int i =0; i < n ; i++)
        {
            System.out.print(a[i]+ " ");
        }

	}    
}
