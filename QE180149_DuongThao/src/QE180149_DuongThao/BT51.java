package QE180149_DuongThao;

import java.util.Scanner;

public class BT51 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int div = 0;
        while (b <= a) {
            if (a % b == 0) {
                div++;
            } 
            b++;
        }
        System.out.print(div);
       
    }
}
