package QE180149_DuongThao;

import java.util.Scanner;

public class BT54 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a <= b) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
