package QE180149_DuongThao;

import java.util.Scanner;

public class BT60 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < a; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print(max);
    }
}
