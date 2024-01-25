package QE180149_DuongThao;

import java.util.Scanner;

public class BT64 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }

        int holder = 0;
        for (int i = 0; i < a; i++) {
            if (array[i] % 2 != 0 && array[i] > 0) {
                holder += array[i];
            }
        }
        System.out.print(holder);
    }
}
