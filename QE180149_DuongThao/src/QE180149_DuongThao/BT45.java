package QE180149_DuongThao;

import java.util.Scanner;

public class BT45 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int odd = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                odd += i;
            }
        }
        System.out.println(odd);
    }
}
