package QE180149_DuongThao;

import java.util.Scanner;

public class BT66 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();

        }

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (array[i] > array[j]) {
                    int swp = array[i];
                    array[i] = array[j];
                    array[j] = swp;
                }
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
