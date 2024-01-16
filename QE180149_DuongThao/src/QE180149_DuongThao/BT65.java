package QE180149_DuongThao;

import java.util.Scanner;

public class BT65 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            if (array[i] >= 0 && array[i] <= 10) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
