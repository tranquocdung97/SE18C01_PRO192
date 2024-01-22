package QE180149_DuongThao;

import java.util.Scanner;

public class BT67 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int holder = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                holder += arr[i][j];
            }
        }
        System.out.print(holder);
    }
}
