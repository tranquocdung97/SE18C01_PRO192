package QE180149_DuongThao;

import java.util.Scanner;

public class BT47 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int numholder = 1;
        for (int i = 1; i <= a; i++) {
            numholder *= i;
        }
        System.out.println(numholder);
    }
}
