package QE180149_DuongThao;

import java.util.Scanner;

public class BT53 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int numholder = 1;
        while (b > 0) {
            numholder *= a;
            b--;
        }
        System.out.print(numholder);
    }
}
