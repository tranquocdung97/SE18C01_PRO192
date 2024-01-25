package QE180149_DuongThao;

import java.util.Scanner;

public class BT74 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int holder = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                holder++;
            }
        }
        System.out.print(holder);
    }
}
