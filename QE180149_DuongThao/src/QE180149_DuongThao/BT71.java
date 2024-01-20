package QE180149_DuongThao;

import java.util.Scanner;

public class BT71 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char c = sc.next().charAt(0);
        int holder = -1;
        for (int i = 0 ; i < a.length(); i++) {
            if (a.charAt(i) == c) { 
                holder = i;
                break;

            }
        }
        System.out.print(holder);
    }
}
