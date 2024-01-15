package QE180149_DuongThao;

import java.util.Scanner;

public class BT32 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("n is a positive number");
        } else if (a == 0) {
            System.out.println("n is equal to 0");
        } else {
            System.out.println("n is a negative number");
        }
    }
}
