package QE180149_DuongThao;

import java.util.Scanner;

public class BT33 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b || a == b) {
            System.out.println("a is greater than or equal to b");
        } else {
            System.out.println("a is smaller than b");
        }
    }
}
