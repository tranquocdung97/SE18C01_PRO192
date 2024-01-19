package QE180149_DuongThao;

import java.util.Scanner;

public class BT75 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String holder = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            holder += s.charAt(i);

        }
        System.out.print(holder);
    }
}
