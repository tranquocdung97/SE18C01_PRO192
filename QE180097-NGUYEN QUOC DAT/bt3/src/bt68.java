/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class bt68 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0; i< n; i++){
            for(int j = 0; j <m; j++){
                arr[i][j] = sc.nextInt();
        }
        }

        int ketqua = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                ketqua += arr[i][j];
            }
        }
        System.out.println(ketqua);

	}
}
