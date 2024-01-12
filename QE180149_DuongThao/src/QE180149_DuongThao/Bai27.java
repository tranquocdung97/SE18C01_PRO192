package QE180149_DuongThao;

import java.util.Scanner;

public class Bai27 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sw1tch = a;
        a = b;
        b = sw1tch;
        System.out.println("after swapping, a = " + a + ", b = " + b);
    }
}
