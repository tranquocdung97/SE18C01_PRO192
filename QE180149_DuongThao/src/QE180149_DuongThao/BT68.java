package QE180149_DuongThao;

import java.util.Scanner;

public class BT68 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int holder = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (array[i][j] % 5 == 0) {
                    holder += array[i][j];
                }
            }
        }
        System.out.print(holder);
    }
}
