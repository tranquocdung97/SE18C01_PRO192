package QE180149_DuongThao;

import java.util.Scanner;

public class BT31 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("n is an even number");
        } else {
            System.out.println("n is an odd number");
        }
    }
}
