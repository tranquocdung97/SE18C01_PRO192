package QE180149_DuongThao;

import java.util.Scanner;

public class BT61 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println(array[0] + array[a - 1]);
    }
}
