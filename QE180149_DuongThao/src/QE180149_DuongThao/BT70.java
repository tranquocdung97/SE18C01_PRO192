package QE180149_DuongThao;

import java.util.Scanner;

public class BT70 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int holder = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                holder++;
            }
        }
        System.out.print(holder);
    }
}
